package com.hmq.demo.model.po;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.hmq.framework.model.GenPO;

<<<<<<< HEAD
=======

>>>>>>> 9a91ad275ddcece6024c60fdfb200cf1dd1c8b75
@Entity
@Table(name = "t_permission")
public class Permission extends GenPO<String>{
	private String permissionName;

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
}
