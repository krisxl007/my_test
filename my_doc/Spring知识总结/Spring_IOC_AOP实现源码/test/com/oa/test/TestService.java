package com.oa.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oa.service.impl.UserServiceImpl;

public class TestService{
	
	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserServiceImpl usi = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
		usi.m();
	}
}