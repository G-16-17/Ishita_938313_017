package com.cognizant.truyum.dao;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.truyum.model.MenuItem;

@Component
public class MenuItemDaoCollectionImpl implements MenuItemDao {

	private static List<MenuItem> menuItemList;
	
	MenuItem M;

	public MenuItemDaoCollectionImpl() {
		super();
		ApplicationContext context = new ClassPathXmlApplicationContext("truyum.xml");
		menuItemList = (List<MenuItem>) context.getBean("menuItems");
	}

	// This Method returns the Menu List for Admin
	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		return menuItemList;
	}

	// This Method returns the Menu List for Customer
	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		List<MenuItem> list = new ArrayList<MenuItem>();
		for (MenuItem menuItem : menuItemList) {
			// SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			if (menuItem.getDateOfLaunch().before(date) || menuItem.getDateOfLaunch().equals(date))
				if (menuItem.isActive())
					list.add(menuItem);
		}
		return list;
	}

	// modify MenuItem
	@Override
	public void modifyMenuItem(MenuItem menuItem) {

		for (int i = 0; i < menuItemList.size(); i++) {
			if (menuItemList.get(i).equals(menuItem)) {
				menuItemList.remove(i);
				menuItemList.add(i, menuItem);
			}

		}

	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {

		for (MenuItem menuItem : menuItemList) {
			if (menuItem.getId() == menuItemId)
				return menuItem;
		}
		return null;
	}

}
