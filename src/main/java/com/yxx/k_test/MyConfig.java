package com.yxx.k_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * xml
 * 注解
 * javaconfig
 */
@Configuration
public class MyConfig {
	@Bean("dept")
	public Dept getDept() {
		Dept d =new Dept();
		d.setDeptno(1);
		d.setDname("yxxc");
		return d;
	}
}
