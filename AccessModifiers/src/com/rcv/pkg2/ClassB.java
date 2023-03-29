package com.rcv.pkg2;

import com.rcv.pkg1.ClassA;

public class ClassB {

	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ca.publicMethod();  //can only access public method/var on other package.
		

	}

}
