package Assignment4;

public final class Triangle implements IArea {

	private final double base;
	private final double height;
	private double side;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public Triangle(double base, double height, double side) {
		super();
		this.base = base;
		this.height = height;
		this.side = side;
	}



	@Override
	public double computeArea() {
		return base * height * (1 / 2);
	}

}
