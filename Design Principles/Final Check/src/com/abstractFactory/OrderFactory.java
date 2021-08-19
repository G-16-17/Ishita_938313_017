package com.abstractFactory;

public class OrderFactory {

	private OrderFactory() {
	}

	public static Order buildOrder(ProductType productType, Channel channel) {
		Order order = null;

		switch (channel) {
		case E_Commerce_Website:
			order = ECommerceWebsiteFactory.buildOrder(productType);
			break;

		case Tele_caller_AgentsApplication:
			order = TeleAgentsFactory.buildOrder(productType);
			break;

		default:
			break;

		}

		return order;

	}
}
