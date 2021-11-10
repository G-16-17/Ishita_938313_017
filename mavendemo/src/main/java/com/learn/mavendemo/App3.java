package com.learn.mavendemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.mavendemo.model.Question;

public class App3 {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("collectionBeans.xml");
		
		Question q1= context.getBean("question1",Question.class);
		//System.out.println(q1);
		
		System.out.println(q1.getQuestionId()+" "+q1.getQuestionText());
		List<String> list=q1.getAnswer();
		for(String string: list) {
			System.out.println(string);
		}
		
		System.out.println("--------------");
		Question q2= context.getBean("question2",Question.class);
		System.out.println(q2.getQuestionId()+" "+q2.getQuestionText());
		list=q2.getAnswer();
		for(String string: list) {
			System.out.println(string);
		}
		
	}

}
