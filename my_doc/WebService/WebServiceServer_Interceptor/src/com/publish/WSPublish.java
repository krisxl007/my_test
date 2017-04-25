package com.publish;
import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;

import com.interceptor.MyInterceptor;
import com.webservice.TestWS;
import com.webserviceImpl.TestWSImpl;

/**
 * 发布webservice接口,发布后即可访问到http://192.168.1.12/xin?wsdl这个wsdl文件目录
 * @author Xin
 *
 */
public class WSPublish {

	public static void main(String[] args) {
		
		TestWS tws = new TestWSImpl();
		
		EndpointImpl ep = (EndpointImpl)Endpoint.publish("http://192.168.1.12/xin", tws);
		
		//给服务器端的webservice资源添加In拦截器
		//ep.getInInterceptors().add(new LoggingInInterceptor());
		ep.getInInterceptors().add(new MyInterceptor());
		
		System.out.println("成功!!!");
	}

}
