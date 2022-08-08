package FlyWeightPattern;

import java.util.Random;

public class Main {

	static String[] colors = { "Red", "Green", "Yellow", "Blue", "Violet" };

	public static void main(String[] args) {

		for (int i = 0; i < 30; i++) {
			Circle circle = (Circle) CircleFactory.createCircle1(colors[new Random().nextInt(colors.length)],
					new Random().nextInt(90) + 10);

			System.out.println(circle.draw());
		}
		System.out.println("Numbers of object created: " + CircleFactory.count);
	}

}
