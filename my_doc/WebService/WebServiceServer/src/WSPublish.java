import javax.xml.ws.Endpoint;

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
		
		/*用Endpoint.publish()方法发布，并传入两个参数：提供服务的url和webservice对象*/
		Endpoint.publish("http://192.168.1.12/xin", tws);
		
		System.out.println("成功!!!");
	}

}
