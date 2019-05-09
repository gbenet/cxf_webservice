package com.iteye.wwwcomy;

import javax.jws.WebService;

import com.sun.javafx.tools.packager.Log;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
@WebService(serviceName = "helloService", endpointInterface = "com.iteye.wwwcomy.IHelloService")
public class HelloService implements IHelloService {


    private static Logger log = Logger.getLogger(HelloService.class.getClass());

	public String sayHello(String username) {
		log.info(username);
		return "欢迎调用本helloService接口";
	}

}
