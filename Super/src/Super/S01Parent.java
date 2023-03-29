package Super;

public class S01Parent {
	
	String str = "Sand";
	int i = 1;

	public static void main(String[] args) {
		S01Parent p = new S01Parent();
		p.parent();

	}
	
	public void parent() {
		System.out.println(str);
		System.out.println(i);
	}
	


}
