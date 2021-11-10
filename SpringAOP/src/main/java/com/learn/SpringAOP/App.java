package com.learn.SpringAOP;

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
        ApplicationContext context= new ClassPathXmlApplicationContext("Appcontext.xml");
        Operation opBean = (Operation)context.getBean("opBean");
        
        opBean.printStr();
        opBean.addMsg();
        
        Calculator calculator= context.getBean("calc",Calculator.class);
        System.out.println(calculator.add(10,20));
        
    }
}
