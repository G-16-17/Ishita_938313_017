package com.learn.SpringAOP;

public class Calculator {
	
	public int add(int a, int b) {
		System.out.println("add");
		return a+b;
	}
	
	public int multiply (int a, int b) {
		System.out.println("multiply");
		return a*b;
	}

}
