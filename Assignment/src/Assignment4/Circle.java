package Assignment4;

public final class Circle implements IArea {

	private final double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double computeArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	
}
