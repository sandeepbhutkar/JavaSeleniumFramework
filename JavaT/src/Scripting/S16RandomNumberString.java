package Scripting;

import java.util.Random;

public class S16RandomNumberString {

	public static void main(String[] args) {
		Random rand = new Random();
        int rand_int = rand.nextInt(100);//will generate random number within 100.
        System.out.println(rand_int);
        //same u can say for String i.e Random we can use.
	}

}
