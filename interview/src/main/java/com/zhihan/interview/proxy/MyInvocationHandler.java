package com.zhihan.interview.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {
	
	private Object target;
	
	public MyInvocationHandler(Object target){
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("--------------------befor-----------------------");
		Object result = method.invoke(target, args);
		System.out.println("--------------------after-----------------------");
		return result;
	}
	
	
	public Object getProxy(){
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class<?>[] cl = target.getClass().getInterfaces();
		Object obj = Proxy.newProxyInstance(loader, cl, this);
		return obj;
	}
	

}
