package Scripting;

public class S10PalindromeString {

	public static void main(String[] args) {
		String str = "MADAM";
		String original_str = str;
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
			
		}
		if(original_str.equals(rev)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
