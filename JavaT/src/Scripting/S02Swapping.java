package Scripting;

public class S02Swapping {

	public static void main(String[] args) {
		int[] intArray = {34,45,80,99};
		int temp;
		temp = intArray[0];
		intArray[0]=intArray[3];
		intArray[3]=temp;
		for(int i = 0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		

	}

}
