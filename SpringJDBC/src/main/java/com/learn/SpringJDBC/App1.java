package com.learn.SpringJDBC;

import java.util.Map.Entry;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learn.SpringJDBC.DAO.EmployeeDAO;
import com.learn.SpringJDBC.model.Employee;

public class App1 {
	
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(JDBCConfiguration.class);
		EmployeeDAO employeeDAO=context.getBean("employeeDAO",EmployeeDAO.class);
		List<Employee> employeeList=employeeDAO.getAllEmployee();
		employeeList.forEach(System.out::println);
		
		System.out.println("----------------");
		
		Map<Integer, List<Employee>> empMap=employeeDAO.getEmployeeDetail();
		for(Entry<Integer, List<Employee>> entry: empMap.entrySet()) {
			System.out.println("Department No: "+ entry.getKey());
			List<Employee> empList=entry.getValue();
			for(Employee employee:empList) {
				System.out.println(employee);
			}
		}
	}

}
