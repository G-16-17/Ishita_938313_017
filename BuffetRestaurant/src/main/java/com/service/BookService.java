package com.service;

import org.springframework.stereotype.Service;

import com.model.BookRestaurant;

//use appropriate annotation to configure BookService as a Service
@Service
public class BookService {

	// calculate the totalCost and return the cost
	public double calculateTotalCost(BookRestaurant book) {

		double cost = 0.0;
	

		cost = (book.getAdultVegCount() * 599) + (book.getAdultNonVegCount() * 699) + (book.getKidsVegCount() * 249)
				+ (book.getKidsNonVegCount() * 349);
		if (book.getHallType().equalsIgnoreCase("AC")) {
			
          cost = cost+500;
		}

		return cost;
	}

}
