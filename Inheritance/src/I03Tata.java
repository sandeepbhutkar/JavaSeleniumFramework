//Multilevel inheritance - this can access methods from parent as well as from parents of parents.
public class I03Tata extends I02Truck {

	public static void main(String[] args) {
		I03Tata ta = new I03Tata();
		ta.start();
		ta.stop();
		ta.small();

	}

}
