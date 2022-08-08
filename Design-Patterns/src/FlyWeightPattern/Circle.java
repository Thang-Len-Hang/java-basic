package FlyWeightPattern;

public class Circle implements Shape {

	private String color;

	private int radius;

	public Circle(String color, int radius) {
		super();
		this.color = color;
		this.radius = radius;
	}

	@Override
	public String draw() {
		return String.format("%s's color circle created with ::%s cm", color, radius);
	}
}
