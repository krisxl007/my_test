package com.action;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.interceptor.MyInterceptor;
import com.opensymphony.xwork2.ActionSupport;
import com.webservice.TestWS;
import com.webserviceimpl.TestWSImpl;

@Controller
@Scope("prototype")
public class WebServiceAction extends ActionSupport {
	
	public String test() throws Exception {
		
		TestWSImpl factory = new TestWSImpl ();
		TestWS tws = factory.getTestWSImplPort();
		
		/*给客户端添加Out拦截器*/
		Client client = ClientProxy.getClient(tws);
		client.getOutInterceptors().add(new MyInterceptor("xin","1234"));
		
		tws.hello();
		 
		return "test";	
	}
}
