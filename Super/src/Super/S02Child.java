package Super;
//var and method are same as parent.
public class S02Child extends S01Parent{

	String str = "Krish";
	int i = 4;

	public static void main(String[] args) {
		S02Child c = new S02Child();
		c.child();

	}
	
	
	public void child() {
		System.out.println(super.str);
		System.out.println(super.i);
		super.parent();       // super keyword is used to access the method and var form parent class
	}
	


}