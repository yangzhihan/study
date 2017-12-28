package com.zhihan.interview.extends_;

import java.util.HashMap;
import java.util.Map;

public class Farther {

	Map map = new HashMap();
	
	public void setProperty(String key, Object value){
		this.map.put(key, value);
	}
	
	
	public void getProperty(String key){
		System.out.println(this.map.get(key));;
	}
	
	
}
