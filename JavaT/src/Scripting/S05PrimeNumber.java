package Scripting;

import java.util.Scanner;

public class S05PrimeNumber {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter Number: ");
		//int num = sc.nextInt();
		//OR
		int num = 3;
		int counter = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					counter++;
			}	
				if (counter == 2) {
					System.out.println("Prime Number");
				} else {
					System.out.println("Not Prime Number");

				}

			

		} else {
			System.out.println("Not a prime number");
		}

	}

}
