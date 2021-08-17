package com.cts;

public interface IRepair extends IServices {
	
	public void processPhoneRepair(String modelName);

	public void processAccessoryRepair(String accessoryType);
}
