package com.yxx.b;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class test {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/yxx/b/applicationContext.xml");
		Dept d= (Dept) ac.getBean("d2");
		System.out.println(d);
		
		
	}

}
