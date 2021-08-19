package com.abstractFactory;

public class CarClient {
	public static void main(String[] args) {

		System.out.println(OrderFactory.buildOrder(ProductType.ELECTRONIC, Channel.E_Commerce_Website));
		System.out.println(OrderFactory.buildOrder(ProductType.FURNITURE, Channel.E_Commerce_Website));
		System.out.println(OrderFactory.buildOrder(ProductType.TOYS, Channel.E_Commerce_Website));
		
		System.out.println(OrderFactory.buildOrder(ProductType.ELECTRONIC, Channel.Tele_caller_AgentsApplication));
		System.out.println(OrderFactory.buildOrder(ProductType.FURNITURE, Channel.Tele_caller_AgentsApplication));
		System.out.println(OrderFactory.buildOrder(ProductType.TOYS, Channel.Tele_caller_AgentsApplication));
	}
}
