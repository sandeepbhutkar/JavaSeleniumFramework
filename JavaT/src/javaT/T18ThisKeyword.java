package javaT;

public class T18ThisKeyword {
	
	int a = 10;
	int b = 20;
	
	public static void main (String[] args) {
		
		T18ThisKeyword tk = new T18ThisKeyword();
		tk.getData();
		
	}
    
	public void getData() {
		int a = 20;
		int b = 30;
		System.out.println(this.a+this.b);  //This keyword is used to access(instance of class) global variables.
	}
}
