package com.learn.SpringAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	//@Before("execution(*com.learn.SpringAOP.bo.CustomerBo.addCustomer(..)")
	@Before("execution(* com.learn.SpringAOP.bo.CustomerBo.*(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("logBefore() is running!");
		System.out.println(("Signature: " +joinPoint.getSignature().getName()));
		System.out.println("------------------");
	}
	
	@After("execution(* com.learn.SpringAOP.bo.CustomerBo.addCustomer(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("logAfter() is running!");
		System.out.println(("Signature: " +joinPoint.getSignature().getName()));
		System.out.println("------------------");
	}
	
	@AfterReturning(pointcut = "execution(* com.learn.SpringAOP.bo.CustomerBo.addCustomer(..))", returning="result" )
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
		System.out.println("logAfterReturning() is running!");
		System.out.println(("Signature: " +joinPoint.getSignature().getName()));
		System.out.println("Method returned value is: "+ result);
		System.out.println("------------------");
	}
	

}
