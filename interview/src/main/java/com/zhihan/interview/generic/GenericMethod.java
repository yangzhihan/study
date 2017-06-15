package com.zhihan.interview.generic;

import java.util.ArrayList;

public class GenericMethod {

	
	public static void main(String[] args) {
		GenericMethod.copyOf(new Integer[10], 0);
		GenericMethod.copyOf(new String[10], 0);
		GenericMethod.copy(new ArrayList[10], 0);
	}

	/**
	 * 定义泛型方法，传入的参数具有泛型，返回的值也是对应的泛型，泛型的字母表示方式可以是任意字母，X,Y,Z
	 * @param original
	 * @param newLength
	 * @return
	 */
	public static <T> T[] copyOf(T[] original, int newLength) {
		return original;
	}
	
	public static <Y> Y[] copy(Y[] original, int newLength) {
		return original;
	}
}
