package com.hmq.demo.model.vo;

import com.hmq.framework.model.GenVO;

public class RolePermissionVO extends GenVO<String>{
	private String roleId;
	private String permissionId;
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}
}
