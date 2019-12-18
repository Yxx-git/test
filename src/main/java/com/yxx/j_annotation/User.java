package com.yxx.j_annotation;

public class User {
	private Integer uid;
	private String uname;
	
	
	public User() {
		super();
		System.out.println("User.User()");
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		System.out.println("User.setUid()");
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		System.out.println("User.setUname()");
		this.uname = uname;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + "]";
	}

}
