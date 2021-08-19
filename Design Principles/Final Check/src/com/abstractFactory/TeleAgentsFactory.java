package com.abstractFactory;

public class TeleAgentsFactory {

	static Order buildOrder(ProductType productType) {

		Order order = null;

		switch (productType) {
		case ELECTRONIC:
			order = new ElectronicOrder(Channel.Tele_caller_AgentsApplication);
			break;

		case FURNITURE:
			order = new FurnitureOrder(Channel.Tele_caller_AgentsApplication);
			break;

		case TOYS:
			order = new ToysOrder(Channel.Tele_caller_AgentsApplication);
			break;

		default:
			break;

		}
		return order;
	}
}
