package Scripting;

public class S21MinMaxFromArray {

	public static void main(String[] args) {
		int a[] = {20,30,40,59};
		int max = a[0]; //this will hold fist value
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {//< for min
				max = a[i];
			}
			
		}
		
		System.out.println(max);
	}

}
