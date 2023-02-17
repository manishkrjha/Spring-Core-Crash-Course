package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/empConfig.xml");
		Student emp1 = (Student)context.getBean("emp1");
		
		System.out.println(emp1);
		System.out.println(emp1.getProps());
	}

}
