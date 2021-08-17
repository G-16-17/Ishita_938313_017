package com.cts;

public class PhoneOrder implements IOrder {

	@Override
	public void processOrder(String modelName) {
		System.out.println(modelName + " order accepted!");
	}

}
