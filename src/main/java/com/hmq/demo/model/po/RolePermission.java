package com.hmq.demo.model.po;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.hmq.framework.model.GenPO;

@Entity
@Table(name = "t_role_permission")
public class RolePermission extends GenPO<String>{
<<<<<<< HEAD
	private String permissionId;
	private String roleId;
	
	public String getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}
=======
	private String roleId;
	private String permissionId;
>>>>>>> 9a91ad275ddcece6024c60fdfb200cf1dd1c8b75
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
<<<<<<< HEAD
=======
	public String getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}
>>>>>>> 9a91ad275ddcece6024c60fdfb200cf1dd1c8b75
}
