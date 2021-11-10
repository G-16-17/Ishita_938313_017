package com.learn.SpringAOP;

public class Operation {
	
	public void msg() {
		System.out.println("msg method invoked");
	}
	
	public int addMsg() {
		System.out.println("addMsg method invoked");
		return 2;
	}
	
	public int printMsg() {
		System.out.println("printMsg method invoked");
		return 3;
	}
	
	public void printStr() {
		System.out.println("printStr method invoked");
	}

}
