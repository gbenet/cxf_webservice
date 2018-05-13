package com.iteye.wwwcomy;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface IHelloService {
	@WebResult(name = "result")
	public String sayHello(@WebParam(name = "userName") String username);
}
