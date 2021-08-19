package com.abstractFactory;

public class ElectronicOrder extends Order {

	ElectronicOrder(Channel channel) { 
		super(ProductType.ELECTRONIC,channel ); 
		processOrder(); 
	}
	
	@Override
	void processOrder() { 
		System.out.println("Connecting to Electronic Products"); 
	}
}
