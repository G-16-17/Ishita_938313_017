package com.learn.SpringAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	
	@Pointcut("execution(* *.add*(..))")  //pointcut("execution(*operation.*(..))")
	public void myPointCut() {}
	
	@Before("myPointCut()") //applying pointcut on before advice
	public void myadvice(JoinPoint jp) //it is advice(before advice)
	{
		System.out.println("additional concern-before advice");
		//sysout("method signature: +jp.getSignature());
	}
	

}
