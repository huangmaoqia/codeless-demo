package com.hmq.demo.service.impl;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmq.demo.dao.IRoleDao;
import com.hmq.demo.model.po.Role;
import com.hmq.demo.model.po.UserRole;
import com.hmq.demo.model.vo.RoleVO;
import com.hmq.demo.service.IRoleService;
import com.hmq.demo.service.IUserRoleService;
import com.hmq.framework.service.impl.GenViewService;
import com.hmq.framework.utils.query.AndConditions;

@Service
@Transactional
public class RoleService extends GenViewService<RoleVO, Role, String, IRoleDao> implements IRoleService {

	@Autowired
	private IUserRoleService userRoleService;
	
	@Override
	public List<Role> findByUserId(String userId) {
		List<UserRole> userRoleList=userRoleService.findByUserId(userId);
		Set<String> roleIds=null;
		if(userRoleList!=null){
			roleIds=userRoleList.stream().map(UserRole::getRoleId).collect(Collectors.toSet());
		}
		AndConditions<Role> conditions=new AndConditions<Role>();
		conditions.addCdIn(Role::getId, roleIds);
		return this.findBySpec(conditions);
	}

}
