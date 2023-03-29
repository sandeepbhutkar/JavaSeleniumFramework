package javaT;

public class T15MultiDiArrays {

	public static void main(String[] args) {
		
		int[][] mulDiArray = {{1,2,3},{4,5,6}};
		
		//to print 2
		System.out.println(mulDiArray[0][1]);
		
		//to print all values
		
		for (int i = 0 ; i<mulDiArray.length ; i++) {
			for (int j = 0 ; j<mulDiArray[i].length; j++) {
				System.out.println(mulDiArray[i][j]);
			}
			
		}

	}

}
