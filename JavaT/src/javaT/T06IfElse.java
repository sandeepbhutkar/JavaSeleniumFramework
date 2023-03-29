package javaT;

public class T06IfElse {

	public static void main(String[] args) {
		int myint1 = 20;
		int myint2 = 20;
		
		if (myint1 == myint2) {
			System.out.println("myint1 == myint2");
		}
		else if (myint1 > myint2) {
			System.out.println("myint1 > myint2");	
		}
		else if (myint1 < myint2) {
			System.out.println("myint1 < myint2");	
		}
		else {
			System.out.println("nothing");
		}
		//nested if else
		int myint3 = 20;
		if (myint1 == myint2) {
			if (myint1 == myint3) {
				System.out.println("all three matched");
				
			}
		}
	}

}
