package com.learn.mavendemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import com.learn.mavendemo.Employee;

public class App2 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
		
		Employee e1=context.getBean("employee1",Employee.class);
		System.out.println(e1);
		
		Employee e2=context.getBean("employee2",Employee.class);
		System.out.println(e2);
		
		Employee e3=context.getBean("employee3",Employee.class);
		System.out.println(e3);
	}

}
