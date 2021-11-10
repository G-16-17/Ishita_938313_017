package com.learn.SpringMVCdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.SpringMVCdemo.dao.UserDao;
import com.learn.SpringMVCdemo.model.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	public boolean validateUser(User user) {
		return userDao.validateUser(user);
	}

}

