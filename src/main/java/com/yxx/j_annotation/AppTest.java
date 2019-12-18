package com.yxx.j_annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	
	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/yxx/j_annotation/app.xml");
		UserAction bean =(UserAction) ac.getBean("userAction");
		bean.save();
	}

}
