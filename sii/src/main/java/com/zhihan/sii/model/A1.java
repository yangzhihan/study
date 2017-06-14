package com.zhihan.sii.model;

import org.apache.ibatis.type.Alias;

@Alias("a1")
public class A1 {

	private int id;
	private int user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	
	
}
