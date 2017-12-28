package com.zhihan.interview.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class FixedThreadPool {

	public static void main(String[] args) {
		Executor e = Executors.newFixedThreadPool(10);
		e.execute(null);

	}

}
