package com.hmq.demo.service.impl;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmq.demo.dao.IPermissionDao;
import com.hmq.demo.model.po.Permission;
import com.hmq.demo.model.po.RolePermission;
import com.hmq.demo.model.vo.PermissionVO;
import com.hmq.demo.service.IPermissionService;
import com.hmq.demo.service.IRolePermissionService;
import com.hmq.framework.service.impl.GenViewService;
import com.hmq.framework.utils.query.AndConditions;

@Service
@Transactional
public class PermissionService extends GenViewService<PermissionVO, Permission, String, IPermissionDao> implements IPermissionService {

	@Autowired
	private IRolePermissionService rolePermissionService;
	
	@Override
	public List<Permission> frindByRoleIds(Collection<String> roleIds) {
		List<RolePermission> rolePermissionList=rolePermissionService.frindByRoleIds(roleIds);
		if(rolePermissionList!=null){
			Set<String> permissionIds=rolePermissionList.stream().map(RolePermission::getPermissionId).collect(Collectors.toSet());
			AndConditions<Permission> conditions=new AndConditions<>();
			conditions.addCdIn(Permission::getId, permissionIds);
			return this.findBySpec(conditions);
		}
		return null;
	}
	
}
