package com.hmq.demo.model.po;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.hmq.framework.model.GenPO;

@Entity
@Table(name = "t_user")
public class User extends GenPO<String>{

	private String userName;
	
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
<<<<<<< HEAD
	
	private String password;
=======
>>>>>>> 9a91ad275ddcece6024c60fdfb200cf1dd1c8b75

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}