package com.interceptor;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class MyInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

	private String username;
	private String password;
	
	public MyInterceptor(String username, String password) {
		super(Phase.PREPARE_SEND); //该客户端拦截器在准备发送前调用
		this.username = username;
		this.password = password;	
	}

	/**
	 * 实现一个为客户端请求webservice添加头文件的拦截器
	 */
	@Override
	public void handleMessage(SoapMessage smg) throws Fault {
		
		/*拿到头文件信息*/
		List<Header> headers = smg.getHeaders();
		
		/*创建头文件信息*/
		Document doc = DOMUtils.createDocument(); //创建Document对象
		Element firstHeader = doc.createElement("firstHeader"); //创建一个叫"firstHeader"名称的Element
		Element usernameElement = doc.createElement("username"); //创建一个叫"username"名称的Element
		Element passwordElement = doc.createElement("password"); //创建一个叫"password"名称的Element
		Element test = doc.createElement("test");
		
		usernameElement.setTextContent(username); //设置该Element的文本内容的值
		passwordElement.setTextContent(password); //设置该Element的文本内容的值
		test.setTextContent("test111");
		firstHeader.appendChild(usernameElement); //将usernameElement子元素放到firstHeader中
		firstHeader.appendChild(passwordElement); //将passwordElement子元素放到firstHeader中
		firstHeader.appendChild(test);
		/**
		 * 上面的代码生成了一个如下XML文档片段:
		 * <firstHeader>
		 * 		<username>username</username>
		 * 		<password>password</password>
		 * </firstHeader>
		 * 
		 */
				
		/*添加创建的头文件到头文件列表中*/
		headers.add(new Header(new QName("testHeader"), firstHeader));
		
	}
	
}
