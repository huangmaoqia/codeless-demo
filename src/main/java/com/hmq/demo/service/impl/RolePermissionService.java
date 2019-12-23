package com.hmq.demo.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmq.demo.dao.IRolePermissionDao;
import com.hmq.demo.model.po.RolePermission;
import com.hmq.demo.model.vo.RolePermissionVO;
import com.hmq.demo.service.IRolePermissionService;
import com.hmq.framework.service.impl.GenViewService;
import com.hmq.framework.utils.query.AndConditions;

@Service
@Transactional
public class RolePermissionService extends GenViewService<RolePermissionVO, RolePermission, String, IRolePermissionDao> implements IRolePermissionService {

	@Override
	public List<RolePermission> frindByRoleIds(Collection<String> roleIds) {
		AndConditions<RolePermission> conditions=new AndConditions<>();
		conditions.addCdIn(RolePermission::getRoleId, roleIds);
		return this.findBySpec(conditions);
	}
}
