package javaT;

public class T03StringLiteralVsStringObject {
	
	public static void main(String[] args) {
		
		//String Object - we create String object.
		
		String string1 = new String("RCV");
		System.out.println(string1);
		
		//String Literal - we do not create object.
		
		String string2 = "RCV";
		System.out.println(string2);
		
		//Comparing.
		System.out.println(string1.equals(string2));
		
	}

}
