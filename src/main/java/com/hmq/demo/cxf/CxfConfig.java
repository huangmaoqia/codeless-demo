package com.hmq.demo.cxf;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hmq.demo.cxf.service.impl.MetCtrlService;
import com.hmq.demo.cxf.service.impl.SayHello;

@Configuration
public class CxfConfig {

	/**
	 * 为了不被springSecurity拦截，自定义暴露的路径 默认为/services/**
	 */
	@Bean
	public ServletRegistrationBean<CXFServlet> myServlet() {
		ServletRegistrationBean<CXFServlet> registrationBean = new ServletRegistrationBean<CXFServlet>(new CXFServlet(),
				"/cxf/*");
		return registrationBean;
	}

	@Bean(name = Bus.DEFAULT_BUS_ID)
	public SpringBus springBus() {
		return new SpringBus();
	}

	// 终端路径
	@Bean
	public Endpoint helloService() {
		EndpointImpl endpoint = new EndpointImpl(springBus(), new SayHello());
		endpoint.publish("/helloService");
		return endpoint;
	}
	
	@Bean
	public Endpoint iMetCtrlService() {
		EndpointImpl endpoint = new EndpointImpl(springBus(), new MetCtrlService());
		endpoint.publish("/iMetCtrlService");
		return endpoint;
	}
}
