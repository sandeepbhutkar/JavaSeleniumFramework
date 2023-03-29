package Scripting;

public class S04Divisible {

	public static void main(String[] args) {
		
		int n=100;
		//Number which is divisible by 3 and 5
		for (int i = 0; i < n; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i+" ");
        }
		
		System.out.println();
		
		//Number which is divisible by 9
		for (int i = 0; i < n; i++)
        {
            if (i % 9 == 0)
                System.out.print(i+" ");
        }

	}

}
