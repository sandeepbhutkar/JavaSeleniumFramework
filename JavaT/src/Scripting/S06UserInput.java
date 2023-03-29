package Scripting;

import java.util.Scanner;

public class S06UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no");
        int f=sc.nextInt();
        System.out.println("Enter second no");
        int s=sc.nextInt();
        int z=f+s;
        System.out.println("Addition= "+z);
		

	}

}
