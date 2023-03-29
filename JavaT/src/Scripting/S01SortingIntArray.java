package Scripting;

public class S01SortingIntArray {

	public static void main(String[] args) {
		int[] arrayList = {13,2,4,2,5,6};
		int temp = 0;
		for(int i=0;i<arrayList.length;i++) {
			for (int j = i+1;j<arrayList.length;j++) {
				if(arrayList[i]<arrayList[j]) {
					temp = arrayList[i];
					arrayList[i]=arrayList[j];
					arrayList[j]=temp;
				}
				
			}
		     System.out.println(arrayList[i]);
		     
		}

	}

}
