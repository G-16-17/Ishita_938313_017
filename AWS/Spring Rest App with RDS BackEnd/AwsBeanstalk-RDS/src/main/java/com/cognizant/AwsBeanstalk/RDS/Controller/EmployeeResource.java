package com.cognizant.AwsBeanstalk.RDS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.AwsBeanstalk.RDS.Beans.Employee;
import com.cognizant.AwsBeanstalk.RDS.Service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeResource {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployee();
	}
	
	@PostMapping
	public String addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
}
