package com.yxx.g_proxy;

public class GeneralProxy implements IGeneral {
	General g =null;
	
	public GeneralProxy(General g) {
		 this.g=g;
	}
	
	
	@Override
	public void pk() {
		// TODO Auto-generated method stub
		System.out.println("上装备");
		g.pk();
		System.out.println("斩");
	}
	
}
