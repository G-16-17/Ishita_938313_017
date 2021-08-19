package com.abstractFactory;

public class ToysOrder extends Order {

	ToysOrder(Channel channel) { 
		super(ProductType.TOYS,channel ); 
		processOrder(); 
	}
	
	@Override
	void processOrder() { 
		System.out.println("Connecting to Toys Products"); 
	}

}
