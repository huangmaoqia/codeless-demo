package com.hmq.demo.service.impl;

import java.util.List;

import org.aspectj.weaver.ast.And;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmq.demo.dao.IUserDao;
import com.hmq.demo.model.po.User;
import com.hmq.demo.model.vo.UserVO;
import com.hmq.demo.service.IUserService;
import com.hmq.framework.service.impl.GenViewService;
import com.hmq.framework.utils.query.AndConditions;

@Service
@Transactional
public class UserService extends GenViewService<UserVO, User, String, IUserDao> implements IUserService {

	@Override
<<<<<<< HEAD
	public UserVO getUserByUserName(String userName) {
		AndConditions<UserVO> conditions=new AndConditions<UserVO>();
		conditions.addCdEq(UserVO::getUserName, userName);
		List<UserVO> voList=this.findVOBySpec(conditions, null, null);
		if(voList!=null&& voList.size()>0) {
			return voList.get(0);
=======
	public User findByUserName(String userName) {
		AndConditions<User> conditions =new AndConditions<>();
		conditions.addCdEq(User::getUserName, userName);
		List<User> userList=this.findBySpec(conditions);
		if(userList!=null&& userList.size()>0){
			return userList.get(0);
>>>>>>> 9a91ad275ddcece6024c60fdfb200cf1dd1c8b75
		}
		return null;
	}

<<<<<<< HEAD
=======
	
>>>>>>> 9a91ad275ddcece6024c60fdfb200cf1dd1c8b75
}
