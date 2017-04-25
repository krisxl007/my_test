package com.webserviceImpl;

import javax.jws.WebService;

import com.webservice.TestWS;

 /**
  * 实现webservice接口
  * @author Xin
  *
  */
@WebService(endpointInterface="com.webservice.TestWS", serviceName="TestWSImpl")
public class TestWSImpl implements TestWS{

	@Override
	public void hello() {
		System.out.println("hello world!");
	}
	
}
