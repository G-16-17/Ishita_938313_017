package com.learn.pack1;

public class ItemDemo {

	public static void main(String[] args) {
		//int x;
		
		Item item1;
		item1 = new Item();
		
		//classname refvarname = new classname();
		//classname objectname = new classname();
		
		Item item2 = new Item();
		
		//objectname.membername
		item1.itemId=1001;
		item1.price=150;
		item1.quantity=2;
		item1.calculateTotal();
		
		item2.itemId=1002;
		item2.price=300;
		item2.quantity=5;
		item2.calculateTotal();

	}

}
