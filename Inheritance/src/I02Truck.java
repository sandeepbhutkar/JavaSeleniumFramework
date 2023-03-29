//Single Inheritance
public class I02Truck extends I01Vehical {

	public static void main(String[] args) {
		I02Truck tk = new I02Truck();
		tk.start();
		tk.stop();

	}
	public void small() {
		System.out.println("small");
	}
}
