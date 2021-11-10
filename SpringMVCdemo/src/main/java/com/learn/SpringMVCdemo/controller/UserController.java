package com.learn.SpringMVCdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learn.SpringMVCdemo.model.Department;
import com.learn.SpringMVCdemo.model.User;
import com.learn.SpringMVCdemo.service.DepartmentService;
import com.learn.SpringMVCdemo.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;

	@Autowired
	DepartmentService departmentService;

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String login() {
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public ModelAndView validateUser(@RequestParam("userName") String userName, @RequestParam("pass") String pass) {
		User user = new User(userName, pass);
		ModelAndView mv = new ModelAndView("home");
		boolean res = service.validateUser(user);
		if (res == false) {
			mv.setViewName("login");
			mv.addObject("errMsg", "Invalid UserName/Password");
		} else {
			List<Department> departmentList = departmentService.getAllDepartment();
			mv.addObject(departmentList);
		}
		return mv;
	}

}

