package com.abstractFactory;

public class ECommerceWebsiteFactory {

	static Order buildOrder(ProductType productType) {

		Order order = null;

		switch (productType) {
		case ELECTRONIC:
			order = new ElectronicOrder(Channel.E_Commerce_Website);
			break;

		case FURNITURE:
			order = new FurnitureOrder(Channel.E_Commerce_Website);
			break;

		case TOYS:
			order = new ToysOrder(Channel.E_Commerce_Website);
			break;

		default:
			break;

		}
		return order;
	}
}
