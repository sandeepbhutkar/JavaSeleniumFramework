package javaT;

public class T16Methods {

	public static void main(String[] args) {
		// method without static, in order to call method we have to create object of class.
		T16Methods obj = new T16Methods();
		obj.loginApp1();
		//if you create static method then class object is not needed.
		loginApp2();
		//method with parameters
		System.out.println(addNumbers(22,33));
		
	}
	//method without static
	public void loginApp1() {
		System.out.println("Logged in1");
	//method with static
	}
	public static void loginApp2() {
		System.out.println("Logged in2");
	}
	//Parameters
	public static int addNumbers(int a, int b) {
		int c = a + b;
		return c;
	}
	

}
