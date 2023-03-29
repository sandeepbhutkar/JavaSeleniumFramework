package com.rcv.pkg1;

/*2 Access Modifiers are for class its public,default(if we do not mention public)
 * default class only be accessed within package, not for other package.
 * 4 Variable modifier as public, private, protected and default*/ 

public class ClassA {
	
	public int publicVar = 1;
	private int privateVar = 2;
	int defaultVar = 3;
	protected int protectedVar = 4;
	
	public static void main(String[] args) {
		
		ClassA ca = new ClassA();//we have to create class object to access method or else methods should be static.
		ca.publicMethod();
		ca.defaultMethod();
		ca.privateMethod();
		ca.protectedMethod();//within class we can access all methods/var
	
	}
	
  
	public void publicMethod() {
		System.out.println("This is publicMethod");

	}
	private void privateMethod() {
		System.out.println("This is privateMethod");

	}
	void defaultMethod() {
		System.out.println("This is defaultMethod");

	}
	protected void protectedMethod() {
		System.out.println("This is protectedMethod");

	}

}
