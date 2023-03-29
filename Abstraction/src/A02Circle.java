// when you mousehover A02Circle and click on "implement methods", all below methods will automatically imported from parent shapes class.
public class A02Circle extends A01Shapes {

	public static void main(String[] args) {
		A02Circle c = new A02Circle();
		c.drawShapes();
		c.colorShapes();

	}

	@Override
	public void drawShapes() {
		System.out.println("Draw Shape Circle");
		
	}

	@Override
	public void colorShapes() {
		System.out.println("Color Shape Circle");
		
	}

}
