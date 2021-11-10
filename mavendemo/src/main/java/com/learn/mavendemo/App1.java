package com.learn.mavendemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.learn.mavendemo.model.Student;

public class App1 {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("bean1.xml");
		//Student s1= context.getBean("student", Student.class);
		//System.out.println(s1);
		
		
		Student stud1= context.getBean("student1",Student.class);
		System.out.println(stud1);

	}

}
