package com.oa.interceptor;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Interceptor {
	
	@Before(value = "execution (public void com.oa.service.impl.UserServiceImpl.m())")
	public void beforeMethod() {
		System.out.println("this is before method");
	}
	
	@After(value = "execution (public void com.oa.service.impl.UserServiceImpl.m())")
	public void afterMethod() {
		System.out.println("this is after method");
	}
}
