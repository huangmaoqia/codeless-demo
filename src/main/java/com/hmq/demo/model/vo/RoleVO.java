package com.hmq.demo.model.vo;

import java.util.Set;

import com.hmq.framework.model.GenVO;

public class RoleVO extends GenVO<String>{
	private String roleName;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	private Set<PermissionVO> permissionVOs;

	public Set<PermissionVO> getPermissionVOs() {
		return permissionVOs;
	}

	public void setPermissionVOs(Set<PermissionVO> permissionVOs) {
		this.permissionVOs = permissionVOs;
	}
}
