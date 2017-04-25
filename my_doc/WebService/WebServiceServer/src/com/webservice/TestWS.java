package com.webservice;

import javax.jws.WebService;

/**
 * 暴露给别人的webservice接口，用@WebService注解来标注
 * @author Xin
 *
 */
@WebService
public interface TestWS {
	public void hello();
}
