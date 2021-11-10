package com.learn.springdemo.next;
import java.util.Date;

public class Product {
	private int productId;
	private String productName;
	private int price;
	private Date dateOfManufacture;
	

	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(int productId, String productName, int price, Date dateOfManufacture) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.dateOfManufacture = dateOfManufacture;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Date getDateOfManufacture() {
		return dateOfManufacture;
	}


	public void setDateOfManufacture(Date dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", dateOfManufacture=" + dateOfManufacture + "]";
	}
	
	

}
