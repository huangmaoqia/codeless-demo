package com.hmq.demo.controller.impl;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hmq.demo.model.po.User;

@RestController
public class LoginController {
	
	@GetMapping(value = "/login")
    public String login(String userName, String password) {

        //对密码进行加密
        //password=new SimpleHash("md5", password, ByteSource.Util.bytes(username.toLowerCase() + "shiro"),2).toHex();
        //如果有点击  记住我
        //UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(username,password,remeberMe);
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userName,password);
        Subject subject = SecurityUtils.getSubject();
        try {
            //登录操作
            subject.login(usernamePasswordToken);
            User user=(User) subject.getPrincipal();
            //更新用户登录时间，也可以在ShiroRealm里面做
//            session.setAttribute("user", user);
//            model.addAttribute("user",user);
            return "index";
        } catch(Exception e) {
//            //登录失败从request中获取shiro处理的异常信息 shiroLoginFailure:就是shiro异常类的全类名
//            String exception = (String) request.getAttribute("shiroLoginFailure");
//            model.addAttribute("msg",e.getMessage());
//            //返回登录页面
//            return "login";
        	return e.getMessage();
        }
    }
}
