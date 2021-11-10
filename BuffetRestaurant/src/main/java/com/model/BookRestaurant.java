package com.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import org.springframework.stereotype.Component;

//pojo class with required attributes,getters and setters 

public class BookRestaurant {
	
	@NotBlank(message="{error.customerName.blank}")
	private String customerName; 
	@NotBlank(message="{error.contactNumber.blank}")
	private String contactNumber;
	private String hallType;
	@Positive(message="{error.adultCount.forVeg.positive}")
	private int adultVegCount;
	@Positive(message="{error.kidsCount.forVeg.positive}")
	private int kidsVegCount;
	@Positive(message="{error.adultCount.forNonVeg.positive}")
	private int adultNonVegCount;
	@Positive(message="{error.kidsCount.forNonVeg.positive}")
	private int kidsNonVegCount;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getHallType() {
		return hallType;
	}
	public void setHallType(String hallType) {
		this.hallType = hallType;
	}
	public int getAdultVegCount() {
		return adultVegCount;
	}
	public void setAdultVegCount(int adultVegCount) {
		this.adultVegCount = adultVegCount;
	}
	public int getKidsVegCount() {
		return kidsVegCount;
	}
	public void setKidsVegCount(int kidsVegCount) {
		this.kidsVegCount = kidsVegCount;
	}
	public int getAdultNonVegCount() {
		return adultNonVegCount;
	}
	public void setAdultNonVegCount(int adultNonVegCount) {
		this.adultNonVegCount = adultNonVegCount;
	}
	public int getKidsNonVegCount() {
		return kidsNonVegCount;
	}
	public void setKidsNonVegCount(int kidsNonVegCount) {
		this.kidsNonVegCount = kidsNonVegCount;
	}	

}
