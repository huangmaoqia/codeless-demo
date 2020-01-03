package com.hmq.demo.model.vo;

import com.hmq.framework.model.GenVO;
<<<<<<< HEAD

=======
>>>>>>> 9a91ad275ddcece6024c60fdfb200cf1dd1c8b75
public class UserRoleVO extends GenVO<String>{
	private String userId;
	private String roleId;
	public String getUserId() {
		return userId;
	}
<<<<<<< HEAD
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRoleId() {
		return roleId;
	}
=======
	public String getRoleId() {
		return roleId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
>>>>>>> 9a91ad275ddcece6024c60fdfb200cf1dd1c8b75
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
}
