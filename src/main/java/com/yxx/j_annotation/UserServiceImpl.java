package com.yxx.j_annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
	@Resource
	IUserDAO ud;
	public void save(User user) {
		// TODO Auto-generated method stub
		System.out.println("UserServiceImpl.save()");
		ud.save(null);
	}

}
