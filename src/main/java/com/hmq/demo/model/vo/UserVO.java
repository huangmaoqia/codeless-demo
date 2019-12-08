package com.hmq.demo.model.vo;

import com.hmq.framework.model.GenVO;

public class UserVO extends GenVO<String> {

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}