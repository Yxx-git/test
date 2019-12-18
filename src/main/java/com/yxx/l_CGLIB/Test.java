package com.yxx.l_CGLIB;

import net.sf.cglib.proxy.Enhancer;

public class Test {
	public static void main(String[] args) {
		Enhancer enhancer =new Enhancer();
		// 设置enhancer对象的父类
		enhancer.setSuperclass(HelloService.class);
		// 设置enhancer的回调对象
		enhancer.setCallback(new MethodInterceptor());
		// 创建代理对象
		HelloService proxy= (HelloService) enhancer.create();
		// 通过代理对象调用目标方法
		proxy.sayHello();
	}

}
