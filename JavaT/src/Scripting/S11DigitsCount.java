package Scripting;

public class S11DigitsCount {

	public static void main(String[] args) {
		int num = 123423;
		int counter=0;
		while(num!=0) {
			num=num/10;
			counter++;
		}
        System.out.println(counter);
	}

}
