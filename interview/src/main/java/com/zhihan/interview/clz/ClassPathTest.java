package com.zhihan.interview.clz;

public class ClassPathTest {

	/**
	 * 寻找位于class路径下的资源文件
	 * @param args
	 */
	public static void main(String[] args) {
		String path = ClassPathTest.class.getResource("/ip_white_list.txt").getPath();
		System.out.println("path:" + path);
	}
}
