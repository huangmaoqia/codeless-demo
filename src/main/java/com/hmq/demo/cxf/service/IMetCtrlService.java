package com.hmq.demo.cxf.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://service.cxf.demo.hmq.com")
public interface IMetCtrlService {
 
    @WebMethod
    public @WebResult String metCtrl(@WebParam(name = "batchNo",targetNamespace = "http://service.cxf.demo.hmq.com") String batchNo
    		,@WebParam(name = "assetNo",targetNamespace = "http://service.cxf.demo.hmq.com") String assetNo
    		,@WebParam(name = "command",targetNamespace = "http://service.cxf.demo.hmq.com") String command);
}
