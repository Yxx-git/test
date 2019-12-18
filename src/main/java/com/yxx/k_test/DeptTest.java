package com.yxx.k_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="applicationContext.xml")
@ContextConfiguration(classes=MyConfig.class)
public class DeptTest {
	@Autowired
	Dept dept;
	@Test
	public void test() {
		System.out.println(dept);
		
	}

}
