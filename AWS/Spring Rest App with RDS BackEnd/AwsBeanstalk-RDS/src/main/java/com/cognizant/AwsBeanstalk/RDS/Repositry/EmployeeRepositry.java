package com.cognizant.AwsBeanstalk.RDS.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.AwsBeanstalk.RDS.Beans.Employee;

public interface EmployeeRepositry extends JpaRepository<Employee,Integer>{
	
}
