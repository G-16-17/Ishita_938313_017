package com.abstractFactory;

public abstract class Order {

	abstract void processOrder();

	ProductType product = null;
	Channel channel = null;

	public Order() {
	}

	public Order(ProductType product, Channel channel) {
		super();
		this.product = product;
		this.channel = channel;
	}

	public ProductType getProduct() {
		return product;
	}

	public void setProduct(ProductType product) {
		this.product = product;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	@Override
	public String toString() {
		return "Order [product=" + product + ", channel=" + channel + "]";
	}

}
