package Scripting;

public class S15FibonacciSeries {

	public static void main(String[] args) {
		int n1=0, n2=1,sum=0;
		System.out.print(n1+" "+n2);// 0 1
		for (int i=2;i<10;i++) {
			sum=n1+n2; //2+3
			System.out.print(" "+sum);//1 2 3 5 8 13 21 34
			n1=n2;
			n2=sum;
		}

	}

}
