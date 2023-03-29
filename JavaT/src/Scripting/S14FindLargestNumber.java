package Scripting;

import java.util.Scanner;

public class S14FindLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a:");
		int a = sc.nextInt();
		System.out.println("Enter number b:");
		int b = sc.nextInt();
		System.out.println("Enter number c:");
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println("a is largest");
		}
		else if(b>a && b>c) {
			System.out.println("b is largest");
		}
		else {
			System.out.println("c is largest");
		}

	}

}
