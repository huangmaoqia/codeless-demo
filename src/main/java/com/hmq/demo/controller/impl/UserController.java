package com.hmq.demo.controller.impl;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hmq.demo.model.po.User;
import com.hmq.demo.model.vo.UserVO;
import com.hmq.demo.service.IUserService;
import com.hmq.framework.controller.impl.GenViewController;

@RestController
@RequestMapping("/user")
public class UserController extends GenViewController<UserVO, User, String, IUserService> {

	
	@GetMapping("/gettt")
	public List<User> gettt() {
		List<User> list = this.getService().tt();
		return list;
	}
}
