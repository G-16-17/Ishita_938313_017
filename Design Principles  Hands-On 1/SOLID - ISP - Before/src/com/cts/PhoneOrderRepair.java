package com.cts;

public class PhoneOrderRepair implements IOrderRepair {

	@Override
	public void processOrder(String modelName) {
		System.out.println(modelName + " order accepted!");
	}

	@Override
	public void processPhoneRepair(String modelName) {
		System.out.println(modelName + " phone repair accepted!");
	}

	@Override
	public void processAccessorRepair(String accessoryType) {
		System.out.println(accessoryType + " accessory repair accepted!");
	}

}
