package com.abstractFactory;

public class FurnitureOrder extends Order {

	public FurnitureOrder(Channel channel) {
		super(ProductType.FURNITURE, channel);
		processOrder();
	}

	@Override
	void processOrder() {
		System.out.println("Connecting to Furniture Products");
	}

}
