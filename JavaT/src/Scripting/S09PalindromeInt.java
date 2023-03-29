package Scripting;

public class S09PalindromeInt {

	public static void main(String[] args) {
		int num = 121;
		int rev = 0;
		int original_num = num;
		
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
        if(rev==original_num) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
	}

}
