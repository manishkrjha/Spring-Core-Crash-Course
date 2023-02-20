package com.springcore.sc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/sc/scConfig.xml");
		
		Person p1 = context.getBean("person1", Person.class);
		System.out.println(p1);
	}

}
