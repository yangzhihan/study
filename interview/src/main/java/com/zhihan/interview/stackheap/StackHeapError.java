package com.zhihan.interview.stackheap;

public class StackHeapError {
	
	/**
	 * StackOverflowError 栈溢出，通常是由递归引起的
	 */
	private void stackOverFlowError(){
		stackOverFlowError();
	}

	public static void main(String[] args) {
		StackHeapError she = new StackHeapError();
		she.stackOverFlowError();
	}

}
