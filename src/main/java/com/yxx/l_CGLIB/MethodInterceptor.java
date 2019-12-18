package com.yxx.l_CGLIB;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodProxy;

public class MethodInterceptor implements net.sf.cglib.proxy.MethodInterceptor {

	
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("====插入前置通知=====");
		Object ob= proxy.invokeSuper(obj, args);
		System.out.println("====插入后者通知=====");
		return ob;
	}

}
