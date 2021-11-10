package com.learn.SpringMVCdemo2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.learn.SpringMVCdemo2.dao.CustomerDao;
import com.learn.SpringMVCdemo2.model.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	public void validateCustomer(Customer customer, BindingResult result) {
		
		boolean res= customerDao.isEmailIdExist(customer.getEmailId());
		if(res==true) {
			result.rejectValue("emailId", "error.emailId", "EmailId Already Exist");
		}
		
		String pass= customer.getPassword();
		String confirmPass= customer.getConfirmPassword();
		if(pass.equals(confirmPass)==false) {
			result.rejectValue("password", "error.password", "Password and Confirm Password are not matching");
		}
		
		if(customerDao.isUserNameExist(customer.getUserName())) {
			result.rejectValue("userName", "error.userName", "UserName Already Exist");
		}
	}
	
	public boolean addCustomer(Customer customer, BindingResult result) {
		validateCustomer(customer, result);
		boolean res=false;
		if(result.hasErrors()==false) {
			res=customerDao.addCustomer(customer);
		}
		return res;
	}
}
