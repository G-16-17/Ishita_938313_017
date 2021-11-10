package com.controller;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.model.BookRestaurant;
import com.service.BookService;


//use appropriate annotation to configure BookController as Controller
@Controller
public class BookController {
	 @Autowired
	 BookService service;
	 @ModelAttribute("hallList")
	  public Map<String, String> populateHallType(){
	  Map<String, String> serviceMap = new HashMap<String, String>();
	  
	  serviceMap.put("AC", "AC");
	  serviceMap.put("NonAC", "NonAC");
	  
	 
	  return serviceMap;                     
	 } 

	 @GetMapping("/showPage")
	 public String home(@ModelAttribute("book") BookRestaurant book) {
	  return "showpage";
	 }
	 
	//invoke the service class - calculateTotalCost method.
	@PostMapping("/billDesk")
	public String calculateTotalCost(@Valid @ModelAttribute("book") BookRestaurant book, 
			BindingResult result,ModelMap model) {
		if(result.hasErrors()) {
			return "showpage";
		}
		double totalCost = service.calculateTotalCost(book);
		model.put("totalCost",totalCost);
		return "billdesk";
	}
	
}
