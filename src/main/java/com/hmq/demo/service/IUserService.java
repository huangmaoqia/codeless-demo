package com.hmq.demo.service;

import com.hmq.demo.model.po.User;
import com.hmq.demo.model.vo.UserVO;
import com.hmq.framework.service.IGenViewService;

public interface IUserService extends IGenViewService<UserVO,User,String>{
<<<<<<< HEAD
	public UserVO getUserByUserName(String userName);
=======
	User findByUserName(String userName);
>>>>>>> 9a91ad275ddcece6024c60fdfb200cf1dd1c8b75
}
