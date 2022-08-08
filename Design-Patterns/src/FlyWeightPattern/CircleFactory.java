package FlyWeightPattern;

import java.util.HashMap;

public class CircleFactory {
	
	static int count;
	
	private static HashMap<String,Shape> circleFlyWeight = new HashMap<>();
	
	public static Shape createCircle(String color, int radius) {
		count++;
		return new Circle(color, radius);
	}
	
	public static Shape createCircle1(String color,int radius) {
		Circle circle = (Circle)circleFlyWeight.get(color);
		
		if(circle == null) {
			circle = new Circle(color,radius);
			count++;
			circleFlyWeight.put(color, circle);
		}
		return circle;
	}
}
