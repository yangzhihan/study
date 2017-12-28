package com.zhihan.interview.extends_;

import java.util.HashMap;
import java.util.Map;

public class Child extends Farther {
	
	Map m = new HashMap();
	
	public void setName(){
		setProperty("1", "11111");
	}

	public static void main(String[] args) {
		Farther f = new Farther();
		Child c = new Child();
		c.setName();
		c.getProperty("1");
		System.out.println(c.m.keySet().size());
		System.out.println(c.map.keySet().size());
	}

}
