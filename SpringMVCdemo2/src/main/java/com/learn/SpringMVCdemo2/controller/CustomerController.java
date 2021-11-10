package com.learn.SpringMVCdemo2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.learn.SpringMVCdemo2.model.Customer;
import com.learn.SpringMVCdemo2.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@RequestMapping(method= RequestMethod.GET, value="/")
	public String display(Model model) {
		model.addAttribute("customer", new Customer());
		return "addCustomer";
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/addCustomer")
	public ModelAndView addCustomer(@Valid @ModelAttribute("customer")Customer customer, BindingResult result) {
		ModelAndView mv= new ModelAndView("addCustomer");
		if(result.hasErrors()==false) {
			boolean res= service.addCustomer(customer, result);
			if(result.hasErrors()==false && res==true) {
				mv.setViewName("success");
				mv.addObject("customer", customer);
			}
		}
		return mv;
	}
	
	@ModelAttribute("countries")
	public List<String> getAllCountries(){
		List<String> countryList= new ArrayList<String>();
		countryList.add("India");
		countryList.add("Pakistan");
		countryList.add("Japan");
		countryList.add("China");
		countryList.add("Russia");
		countryList.add("South Korea");
		countryList.add("Thailand");
		countryList.add("Vietnam");
		
		return countryList;
	}
	
}
