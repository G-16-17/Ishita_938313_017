package com.learn.mavendemo.model;

import java.util.List;

public class Cart {
	
	private int id;
	private String user;
	private List<MenuItem> menuItem;

	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(int id, String user, List<MenuItem> menuItem) {
		super();
		this.id = id;
		this.user = user;
		this.menuItem = menuItem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public List<MenuItem> getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(List<MenuItem> menuItem) {
		this.menuItem = menuItem;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", user=" + user + ", menuItem=" + menuItem + "]";
	}
	
	

}
