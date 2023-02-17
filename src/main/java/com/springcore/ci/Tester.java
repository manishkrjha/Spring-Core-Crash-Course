package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciConfig.xml");
		Person p = (Person) context.getBean("person");
//		System.out.println(p);
		
		Addition add = (Addition) context.getBean("add");
		add.sum();
	}
}
