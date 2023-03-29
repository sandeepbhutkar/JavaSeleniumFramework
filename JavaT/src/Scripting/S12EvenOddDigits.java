package Scripting;

public class S12EvenOddDigits {

	public static void main(String[] args) {
		int num = 12345;
		int even_counter = 0;
		int odd_counter = 0;
		
		while(num>0) {
			int last_num = num%10; //%10 means get last num
			
			if (last_num%2==0) {
				even_counter++;
			}
			
			else {
				odd_counter++;
			}
	        num=num/10; // /10 means remove last num
	        
		}
		System.out.println("Even count"+even_counter);
        System.out.println("Odd count"+odd_counter);
	}

}
