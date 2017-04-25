package com.oa.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.oa.dao.impl.UserDaoImpl;

@Component
public class UserServiceImpl{

	@Resource
	private UserDaoImpl userDaoImpl;

	public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}

	public void m() {
		System.out.println(userDaoImpl);
	}
}
