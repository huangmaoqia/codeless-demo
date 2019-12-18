package com.hmq.demo.service;

import java.util.List;

import com.hmq.demo.model.po.User;
import com.hmq.demo.model.vo.UserVO;
import com.hmq.framework.service.IGenViewService;

public interface IUserService extends IGenViewService<UserVO,User,String>{
	public List<User> tt();
}
