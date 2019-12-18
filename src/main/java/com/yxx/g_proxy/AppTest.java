package com.yxx.g_proxy;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		IGeneral g =new GeneralProxy(new General());
		g.pk();
	}

}
