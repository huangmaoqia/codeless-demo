package com.hmq.demo.cxf.service.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.hmq.demo.cxf.service.ISayHello;

@Component
@WebService(serviceName="helloService",  //【对外发布的服务名 】：需要见名知意
        targetNamespace="http://service.cxf.demo.hmq.com", //【名称空间】：要跟接口的保持一致
        endpointInterface = "com.hmq.demo.cxf.service.ISayHello") //【服务接口全路径】
public class SayHello implements ISayHello {
 
    @Override
    public String sayHello(String userName) {
        System.out.println("hello!"+userName);
        return "hello!"+userName;
    }
}