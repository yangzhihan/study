package com.zhihan.sii;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ControllerAspect {

	//@Pointcut(value = "execution(* com.mljr.carfinance.controller..*(..))")
//	@Pointcut(value = "execution(* com.mljr.carfinance.controller.jc.JcOrderController.getOrderList(..))")
//	public void aspect(){
//		
//	}
	
	public ControllerAspect(){
		System.out.println("测试切面****************************");
	}
	
	
	@Before(value = "execution(* com.zhihan.sii..*(..))")
	public void before(JoinPoint point){
		System.out.println("测试切面****************************" + point.toString());
	}
	
	
//	@Around(value = "aspect()")
//	public void around(JoinPoint point){
//		System.out.println("测试切面****************************" + point.toString());
//	}
}
