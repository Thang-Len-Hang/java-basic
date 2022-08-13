package Assignment4;

public class Main {

	public static void main(String[] args) {
		
		IArea area = new Circle(4);
		System.out.println("Circle Area: "+area.computeArea());
		//System.out.printf("Area: %.2f"+area.computeArea());
		
		IArea area1 = new Rectangle(4,3);
		System.out.println("Rectangle Area: "+area1.computeArea());

		IArea area2 = new Triangle(2, 5);
		System.out.println("Triangle Area: "+area2.computeArea());
		
		IArea area3 = new Triangle(2, 5, 6);
		System.out.println("Triangle Area: "+area3.computeArea());

	}

}
