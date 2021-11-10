package com.learn.SpringMVCdemo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learn.SpringMVCdemo.model.Department;
import com.learn.SpringMVCdemo.service.DepartmentService;
import com.learn.SpringMVCdemo.service.IdAlreadyExistException;

@Controller
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	@RequestMapping(method = RequestMethod.GET, value = "/home")
	public ModelAndView displayHome() {
		ModelAndView mv = new ModelAndView("home");
		List<Department> departmentList = departmentService.getAllDepartment();
		mv.addObject("departmentList", departmentList);
		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/delete")
	public ModelAndView delete(@RequestParam("id") int id) {
		System.out.println("It is delete method");
		departmentService.deleteDepartment(id);
		System.out.println("Department Deleted");
		ModelAndView mv = new ModelAndView("home");
		List<Department> departmentList = departmentService.getAllDepartment();
		mv.addObject("departmentList", departmentList);
		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/addDepartment")
	public String add(Model model) {
		model.addAttribute("department", new Department());
		return "addDepartment";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/addDepartment")
	public ModelAndView save(@ModelAttribute("department") Department department) throws IdAlreadyExistException {
		ModelAndView mv = new ModelAndView("home");
		boolean res = departmentService.addDepartment(department);
		List<Department> departmentList = departmentService.getAllDepartment();
		mv.addObject("departmentList", departmentList);
		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/edit")
	public ModelAndView edit(@RequestParam("id") int id) {
		Department department = departmentService.getDepartmentById(id);
		ModelAndView mv = new ModelAndView("editDepartment");
		mv.addObject("department", department);
		return mv;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/save")
	public ModelAndView saveDepartment(@ModelAttribute("department") Department department) {
		System.out.println(department.getLocation());
		ModelAndView mv = new ModelAndView("home");
		boolean res = departmentService.updateDepartment(department);
		List<Department> departmentList = departmentService.getAllDepartment();
		mv.addObject("departmentList", departmentList);
		return mv;
	}

	@ExceptionHandler(value = IdAlreadyExistException.class)
	public ModelAndView exceptionHanler(HttpServletRequest request, IdAlreadyExistException exp) {
		Department dept = new Department(Integer.parseInt(request.getParameter("departmentId")),request.getParameter("departmentName"),request.getParameter("location"));
		ModelAndView mv = new ModelAndView("addDepartment","department",dept);
		mv.addObject("errMsg",exp.getMessage());
		return mv;
	}
}

