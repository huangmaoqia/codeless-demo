package com.hmq.demo.model.vo;

import java.util.Set;

import com.hmq.framework.model.GenVO;

public class UserVO extends GenVO<String> {

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	private Set<RoleVO> roleVOs;

	public Set<RoleVO> getRoleVOs() {
		return roleVOs;
	}

	public void setRoleVOs(Set<RoleVO> roleVOs) {
		this.roleVOs = roleVOs;
	}
}