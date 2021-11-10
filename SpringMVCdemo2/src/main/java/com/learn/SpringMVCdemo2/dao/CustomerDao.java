package com.learn.SpringMVCdemo2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.learn.SpringMVCdemo2.model.Customer;

@Component
public class CustomerDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public boolean isEmailIdExist(String emailId) {
		String query= "select count(*) from customer where email_id=?";
		int n= jdbcTemplate.queryForObject(query, Integer.class, emailId);
		return n>0;
	}
	
	public boolean isUserNameExist(String userName) {
		String query= "select count(*) from customer where user_name=?";
		int n= jdbcTemplate.queryForObject(query, Integer.class, userName);
		return n>0;
	}
	
	public boolean addCustomer(Customer customer) {
		String query= "insert into customer(first_name, last_name, user_name, email_id, password, gender, date_of_birth, country) values (?,?,?,?,?,?,?,?)";
		int n = jdbcTemplate.update(query, 
				new Object[] {customer.getFirstName(), customer.getLastName(), customer.getUserName(), customer.getEmailId(), customer.getPassword(), customer.getGender(), customer.getDateOfBirth(),
						customer.getCountry()});
		return n>0;
	}
}
