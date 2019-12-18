package com.yxx.j_annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Controller
public class UserAction {
	@Resource
	IUserService us;
	public void save() {
		System.out.println("UserAction.save()");
		us.save(null);
	}

}
