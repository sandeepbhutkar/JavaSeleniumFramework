package javaT;
// class name and method names should be same
// no return type
// call method based on arguments.
public class T17Constructor {
	
	public static void main(String[] args) {
		
		T17Constructor c = new T17Constructor(1,2); //call method based on arguments.
	}
	
	public  T17Constructor() {
		System.out.println("No Argument");
	}
	
	public  T17Constructor(int i) {
		System.out.println("one argument");
	}
	
	public  T17Constructor(int i, int j) {
		System.out.println("multiple argument");
	}

}
