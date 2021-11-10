package com.learn.pack1;

public class Item {
	//state
	int itemId;
	int price;
	int quantity;
	//behaviour
	//method-- lower camel case
	void calculateTotal() {
		//amount is a local variable
		int amount = price * quantity;
		System.out.println("Amount = " + amount);
	}
	void show() {
		//it is a error- because scope of amount is only within calculateTOtak method alone
		//bcoz it is a local variable
		//system.out.println("/Amount= "+amount);
		System.out.println("Price= "+price);
	}
}
