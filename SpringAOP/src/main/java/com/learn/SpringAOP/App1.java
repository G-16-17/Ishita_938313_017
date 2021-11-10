package com.learn.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.SpringAOP.bo.CustomerBo;

public class App1 {
	
	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("AppContext1.xml");
		CustomerBo customerBo = appContext.getBean("customerBo",CustomerBo.class);
		customerBo.addCustomer();
		customerBo.addCustomerReturnValue();
		
	}

}
