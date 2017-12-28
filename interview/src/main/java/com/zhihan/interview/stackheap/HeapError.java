package com.zhihan.interview.stackheap;

import java.util.ArrayList;
import java.util.List;

public class HeapError {
	
	/**
	 * StackOverflowError 栈溢出，通常是由递归引起的
	 */
	private void createFlowError(){
		List list = new ArrayList<>();
		int[] temp = new int[1024];
		while(true){
			list.add(temp);
		}
	}

	public static void main(String[] args) {
//		HeapError she = new HeapError();
//		she.createFlowError();
		
		System.out.println(System.getProperty("java.io.tmpdir"));
		
//		java.security.AccessController.doPrivileged((PrivilegedAction) () -> "");
		java.security.AccessController.doPrivileged(new java.security.PrivilegedAction(){
			public String run(){
				return "";
			}
		});
	}

}
