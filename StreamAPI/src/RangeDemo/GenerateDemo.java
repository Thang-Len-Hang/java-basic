package RangeDemo;

import static java.util.stream.IntStream.range;

class Repeat {
	public static void repeat(int n, Runnable action) {
		range(0, n).forEach(i -> action.run());
	}
}

public class GenerateDemo {

	static void hi() {
		System.out.println("HI!");
	}

	public static void main(String[] args) {

		Repeat.repeat(3, () -> System.out.println("Looping"));
		Repeat.repeat(2, GenerateDemo::hi);
	}

}
