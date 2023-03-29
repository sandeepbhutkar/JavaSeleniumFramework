package javaT;

public class T10DoWhile{
	
	public static void main(String[]args) {
		
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		} while(i<10);  //if i say (i>10) as i not greater than 10 it will print 1
		
		// diff between while and do while - while condition will execute code block based on condtion first
		//while do while will execute do block of code always and then check while condition.
		
	}
}
