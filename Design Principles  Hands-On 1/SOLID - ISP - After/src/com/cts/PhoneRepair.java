package com.cts;

public class PhoneRepair implements IRepair {

	@Override
	public void service() {
		
	}

	@Override
	public void processPhoneRepair(String modelName) {
		System.out.println(modelName + " phone repair accepted!");
	}

	@Override
	public void processAccessoryRepair(String accessoryType) {
		System.out.println(accessoryType + " accessory repair accepted!");
	}


}
