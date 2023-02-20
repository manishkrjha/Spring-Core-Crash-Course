package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring/empConfig.xml");
		
		Employee e1 = context.getBean("emp1", Employee.class);
		System.out.println(e1);
	}

}
