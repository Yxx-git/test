package com.yxx.a;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class test {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/yxx/a/applicationContext.xml");
		Dept d= (Dept) ac.getBean("dept");
		System.out.println(d);
	}

}
