package Itreate;

import java.util.stream.Stream;

public class Fibonacci {

	int x = 1;

	Stream<Integer> numbers() {
		return Stream.iterate(0, i -> {
			int result = x + i;
			x = i;
			return result;
		});
	}

	public static void main(String[] args) {

		new Fibonacci().numbers()
			.skip(1)
			.limit(10)
			.forEach(System.out::println);
	}
}
