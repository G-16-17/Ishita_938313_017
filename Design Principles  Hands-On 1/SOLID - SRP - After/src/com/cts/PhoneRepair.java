package com.cts;

public class PhoneRepair implements IRepair {

	@Override
	public void processPhoneRepair(String modelName) {
		System.out.println(modelName + " order accepted!");
	}

	@Override
	public void processAccessorRepair(String accessoryType) {
		System.out.println(accessoryType + " accessory repair accepted!");
	}
}
