package com.hmq.demo.cxf.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://service.cxf.demo.hmq.com")
public interface ISayHello {
 
    @WebMethod
    public @WebResult String sayHello(@WebParam(name = "userName") String userName);
}
