package com.yxx.n_aop2;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAOP {
	public void before() {
		System.out.println("MyAOP.before()");
	}
	
	public void afterReturning() {
		System.out.println("MyAOP.afterReturning()");
	}
	
	public Object around(ProceedingJoinPoint pjp) {
		System.out.println("MyAOP.around()");
		Object obj =null;
		
		try {
			obj=pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
		
	}
	
	public void afterThrowing() {
		System.out.println("MyAOP.afterThrowing()");
	}
	
	public void after() {
		System.out.println("MyAOP.after()");
	}

}
