package com.hmq.demo.model.vo;

import com.hmq.framework.model.GenVO;

public class PermissionVO extends GenVO<String>{
	private String permissionName;

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
}
