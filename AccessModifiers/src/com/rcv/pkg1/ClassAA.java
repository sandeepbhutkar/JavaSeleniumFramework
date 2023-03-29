package com.rcv.pkg1;

public class ClassAA {

	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ca.defaultMethod();
		ca.protectedVar();
		ca.publicMethod();  //In other class we can access all methods except private/var

	}

}
