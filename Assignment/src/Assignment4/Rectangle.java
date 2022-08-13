package Assignment4;

public final class Rectangle implements IArea {

	private final double width;
	private final double height;

	

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}



	@Override
	public double computeArea() {
		return width * height;
	}

}
