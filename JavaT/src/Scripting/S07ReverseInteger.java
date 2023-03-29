package Scripting;

public class S07ReverseInteger {

	public static void main(String[] args) {
		int num = 123;
		int rev = 0;
		
		while(num!=0) {
			rev = rev*10 + num%10;  //0+12=3     30+2=32  320+1=321 
			num = num/10; //12  1
		}
        System.out.println("reverse number is: "+rev);
	}

}
