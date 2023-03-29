package Scripting;

public class S05PrimeNumberShowAll {

	public static void main(String[] args) {
		int i, n, counter, j;
		n = 50;
		for (j = 2; j <= n; j++) {
			counter = 0;
			for (i = 1; i <= j; i++) {
				if (j % i == 0) {
					counter++;
				}
			}
			if (counter == 2)
				System.out.print(j + " ");
		}
	}

}
