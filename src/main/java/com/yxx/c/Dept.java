package com.yxx.c;

public class Dept {
	private Integer did;
	private static Dept d;
	public static Dept show() {
		return d;
	}

	public int getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	@Override
	public String toString() {
		return "Dept [did=" + did + "]";
	}
	
	

}
