package com.zhihan.interview.proxy;

public class ProxyTest {

	public static void main(String[] args) {
		ProxyInterface proxyImpl = new ProxyInterfaceImpl();
		MyInvocationHandler handler = new MyInvocationHandler(proxyImpl);
//		ProxyInterface proxy = (ProxyInterface) handler.getProxy();
//		proxy.add();
		
	    proxyImpl = (ProxyInterface) handler.getProxy();
	    proxyImpl.add();

	}

}
