package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleConfig.xml");
		
//		Samosa s1 = (Samosa) context.getBean("samosa1");
//		System.out.println(s1);
		
//		Telling container to shutdown hook
//		Registering shutdown hook
		context.registerShutdownHook();
		
//		System.out.println("---------------------------");
		
//		Pepsi p1 = (Pepsi) context.getBean("pepsi1");
//		System.out.println(p1);
//		
//		System.out.println("---------------------------");
		
		Jalebi j1 = (Jalebi) context.getBean("jalebi1");
		System.out.println(j1);
	}

}
