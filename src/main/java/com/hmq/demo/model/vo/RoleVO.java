package com.hmq.demo.model.vo;

import com.hmq.framework.model.GenVO;

public class RoleVO extends GenVO<String>{
	private String roleName;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
