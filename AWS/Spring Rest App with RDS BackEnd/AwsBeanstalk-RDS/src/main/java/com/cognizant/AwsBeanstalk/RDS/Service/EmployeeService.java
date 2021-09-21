package com.cognizant.AwsBeanstalk.RDS.Service;

import java.util.List;

import com.cognizant.AwsBeanstalk.RDS.Beans.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	String addEmployee(Employee employee);

}
