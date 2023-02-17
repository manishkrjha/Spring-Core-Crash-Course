package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	
	
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		
		System.out.println("double constructor called");
	}
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		
		System.out.println("int constructor called");
	}
	
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		
		System.out.println("str constructor called");
	}
	
	public void sum() {
		System.out.println("Sum: " + (this.a + this.b));
	} 
}
