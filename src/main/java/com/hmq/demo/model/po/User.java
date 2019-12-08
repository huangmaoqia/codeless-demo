package com.hmq.demo.model.po;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.hmq.framework.model.GenPO;

@Entity
@Table(name = "t_user")
public class User extends GenPO<String>{

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}