package javaT;

public class T07TernaryOperator {

	public static void main(String[] args) {
		// TernaryOperator - to write if else statements in single line
		
		String str1 = "Pune";
		String str2 = "Mumbai";
		
		if (str1.equals(str2)) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not Equals");
		}
//so instead of using if else we use as below
		
		String result = (str1.equals(str2)) ? "Equals" : "Not Equals";
		System.out.println(result);
		
	}

}
