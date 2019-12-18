package com.yxx.m_Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class MyRound {
	@Pointcut("execution(* com.woniu.n_aop..*.*(..))")
	public void pc() {}
	@Around("pc()")
	public Object around(ProceedingJoinPoint pjp) {
		Object proceed=null;
		System.out.println("before");
		
		try {
			proceed = pjp.proceed();
			System.out.println("afterReturning");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("afterThrowing");
			e.printStackTrace();
		}finally {
			System.out.println("after");
		}
		return proceed;
	}
}
