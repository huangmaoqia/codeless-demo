package com.hmq.demo.model.vo;

import com.hmq.framework.model.GenVO;
public class UserRoleVO extends GenVO<String>{
	private String userId;
	private String roleId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
}
