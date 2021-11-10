package com.learn.mavendemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
        Department d1 = context.getBean("department1",Department.class);
        System.out.println(d1.getDepartmentId()+" "+d1.getDepartmentName());
        
        Department d2 = context.getBean("department1",Department.class);
        System.out.println(d2.getDepartmentId()+" "+d2.getDepartmentName());
        
        d2.setDepartmentId(20);
        d2.setDepartmentName("Finance");
        System.out.println("------After changing d2------");
        System.out.println("Value of d1");
        System.out.println(d1.getDepartmentId()+" "+d1.getDepartmentName());
        System.out.println("Value of d2");
        System.out.println(d2.getDepartmentId()+" "+d2.getDepartmentName());
        
        System.out.println("---------");
        Department dept = context.getBean("department2",Department.class);
        System.out.println(dept.getDepartmentId()+" "+dept.getDepartmentName());
        
    }
}
