package com.hmq.demo.cxf.service.impl;

import javax.jws.WebService;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.stereotype.Component;

import com.hmq.demo.cxf.service.IMetCtrlService;

@Component
@WebService(serviceName = "iMetCtrlService", // 【对外发布的服务名 】：需要见名知意
		targetNamespace = "http://service.cxf.demo.hmq.com", // 【名称空间】：要跟接口的保持一致
		endpointInterface = "com.hmq.demo.cxf.service.IMetCtrlService") // 【服务接口全路径】
public class MetCtrlService implements IMetCtrlService {

	@Override
	public String metCtrl(String batchNo, String assetNo, String command) {
		new Thread(() -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// 创建动态客户端
			JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
			Client client = dcf.createClient("http://127.0.0.1:9080/grm/webservice/noticeSwitchingService?wsdl");
			// 需要密码的情况需要加上用户名和密码
			// client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME,
			// PASS_WORD));
			Object[] objects = null;
			try {
				// invoke("方法名",参数1,参数2,参数3....);
				objects = client.invoke("execOver", batchNo,assetNo,command);
				System.out.println("返回数据:" + objects[0]);
			} catch (java.lang.Exception e) {
				e.printStackTrace();
			}
		}).start();// 用的省略格式

		return "success";
	}
}