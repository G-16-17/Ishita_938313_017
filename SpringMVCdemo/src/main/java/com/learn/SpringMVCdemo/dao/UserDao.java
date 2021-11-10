package com.learn.SpringMVCdemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.learn.SpringMVCdemo.model.User;

@Component
public class UserDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public boolean validateUser(User user) {
		String query = "select count(*) from user where username=? and password=?";
		int n = jdbcTemplate.queryForObject(query, Integer.class,
				new Object[] { user.getUserName(), user.getPassword() });
		return n>0;
	}

}
