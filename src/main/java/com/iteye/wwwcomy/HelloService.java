package com.iteye.wwwcomy;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

@Component
@WebService(serviceName = "helloService", endpointInterface = "com.iteye.wwwcomy.IHelloService")
public class HelloService implements IHelloService {

	public String sayHello(String username) {
		return username + "! Welcome to CXF in Method[HelloService sayHello]";
	}

}
