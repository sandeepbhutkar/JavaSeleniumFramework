/* Var cannot be changed 
 * method cannot be changed
 * class cannot be inherited*/

package Final;

final public class F01Parent {
	
	final int i = 10;

	public static void main(String[] args) {
		F01Parent p = new F01Parent();
		System.out.println(p.i);
		//p.i = 20;
		//System.out.println(p.i); // if final is not used var can be changed.

	}

}
