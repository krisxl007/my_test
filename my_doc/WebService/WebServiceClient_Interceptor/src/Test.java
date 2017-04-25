import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;

import com.interceptor.MyInterceptor;
import com.webservice.TestWS;
import com.webserviceimpl.TestWSImpl;

public class Test {

	public static void main(String[] args) {
		
		/*new出拿到的实例对象*/
		TestWSImpl factory = new TestWSImpl();
		TestWS tws = factory.getTestWSImplPort();
		
		/*给客户端添加Out拦截器*/
		Client client = ClientProxy.getClient(tws);
		client.getOutInterceptors().add(new MyInterceptor("xin","1234"));
		
		tws.hello();
	}

}
