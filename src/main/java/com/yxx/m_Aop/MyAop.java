package com.yxx.m_Aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAop {
	@Before("execution(* com.woniu.m_Aop.ServiceImpl.save())")
	public void before() {
		System.out.println("MyAop.before()");
	}
	@After("execution(* com.woniu.m_Aop.ServiceImpl.save())")
	public void after() {
		System.out.println("MyAop.before()");
	}

}
