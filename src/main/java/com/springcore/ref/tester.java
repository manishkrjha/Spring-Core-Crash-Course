package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		A tmp = (A)context.getBean("aref");
		
		System.out.println(tmp.getX());
		System.out.println(tmp.getOb().getY());
		
		A tmp2 = (A)context.getBean("aref2");
		System.out.println(tmp2.getX());
		System.out.println(tmp2.getOb().getY());
	}

}
