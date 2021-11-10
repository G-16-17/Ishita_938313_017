package com.learn.springdemo;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.springdemo.next.Employee;
import com.learn.springdemo.next.Product;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       
       Employee e1 = context.getBean("emp1",Employee.class);
       System.out.println(e1);
       
       Product p1 = context.getBean("product1", Product.class);
       System.out.println(p1);
       
       Product p3 = context.getBean("product3", Product.class);
       System.out.println(p3);
       
       LocalDate d1= context.getBean("date1",LocalDate.class);
       System.out.println(d1);
    }
}
