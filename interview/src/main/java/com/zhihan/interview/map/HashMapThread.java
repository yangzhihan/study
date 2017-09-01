package com.zhihan.interview.map;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class HashMapThread extends Thread {

	private static AtomicInteger ai = new AtomicInteger(0);
	private static HashMap<Integer, Integer> map = new HashMap<>(1);
	
	/**
	 * HashMap在多线程下扩容，容易引起死循环
	 * 解决方案：
	 * 1：使用Collections.synchronizedMap(Map<K,V> m)方法，把HashMap变成一个线程安全的Map
	 * 2：使用Hashtable、ConcurrentHashMap这两个线程安全的Map
	 */
	public void run(){
		while(ai.get() < 1000000){
			map.put(ai.get(), ai.get());
			ai.incrementAndGet();
		}
	}
	
	
	public static void main(String[] args) {
		HashMapThread t0 = new HashMapThread();
		HashMapThread t1 = new HashMapThread();
		HashMapThread t2 = new HashMapThread();
		HashMapThread t3 = new HashMapThread();
		HashMapThread t4 = new HashMapThread();
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
