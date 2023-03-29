//Polymorphism - is same method names with diff argument types. When called , call is based on argument type.

public class Polymorphism {

	public static void main(String[] args) {
		
		Polymorphism pl = new Polymorphism();
		pl.login("Hello", "Hi");
		pl.login(23, "Hi");
		pl.login("Hello", "Hi", 34);
		

	}
	
	public void login(String name, String password) {
		System.out.println("Logged in by name and password"+"  " + name + " " + password);
	}
	public void login(int id, String password) {
		System.out.println("Logged in by id and password"+"  " + id + " " + password);
	}
	public void login(String name, String password,int id ) {
		System.out.println("Logged in by name and password and id"+"  " + name + " " + password+ " " + id );
	}

}
