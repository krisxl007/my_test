package com.interceptor;

import java.util.List;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * 自定义拦截器时需要继承AbstractPhaseInterceptor这个类,当拦截器抛出一个Fault异常时将自动取消访问webservice资源
 * @author Xin
 *
 */
public class MyInterceptor extends AbstractPhaseInterceptor<SoapMessage>{

	public MyInterceptor() {
		super(Phase.PRE_INVOKE); //该拦截器将会在调用webservice前起作用
	}

	/**
	 * 实现一个验证用户名和密码的拦截器
	 */
	@Override
	public void handleMessage(SoapMessage smg) throws Fault {
		
		System.out.println("拦截器起作用了");
		
		List<Header> headers = smg.getHeaders(); //获取SOAP信息的请求头header
		if(headers == null || headers.size() < 1) { //如果没有请求头
			throw new Fault(new IllegalArgumentException("没有Header信息"));
		}
		
		/*假如用户名和密码是放在第一个请求头中,分别叫username和password*/
		Header firstHeader = headers.get(0); //拿到第一个请求头
		Element ele = (Element) firstHeader.getObject(); //拿到第一个请求头中的元素
		
		NodeList userNames = ele.getElementsByTagName("username"); //根据指定的名字拿到节点列表
		NodeList userPasswords = ele.getElementsByTagName("password"); //根据指定的名字拿到节点列表

		if(userNames.getLength() != 1) { //判断是否只有一个叫"username"的元素
			throw new Fault(new IllegalArgumentException("用户名格式不正确"));
		}	
		
		if(userPasswords.getLength() != 1) { //判断是否只有一个叫"password"的元素
			throw new Fault(new IllegalArgumentException("密码格式不正确"));
		}
		
		String  username = userNames.item(0).getTextContent(); //拿到该节点列表中第一个节点的文本内容
		String  password = userPasswords.item(0).getTextContent();
		
		if(!username.equals("xin") || !password.equals("1234")) { //实际项目用应查询数据库该用户是否有使用webservice的资格
			throw new Fault(new IllegalArgumentException("用户名和密码不正确,请联系我们取得使用资格"));
		}
	}

}
