package RangeDemo;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LetterGenerator implements Supplier<String> {

	Random random = new Random(47);
	char[] letters = "ABCDEFGHIJKLMOPQRSTUVWXYZ".toCharArray();

	@Override
	public String get() {
		return "" + letters[random.nextInt(letters.length)];
	}

	public static void main(String[] args) {
		String word = Stream.generate(new LetterGenerator())
				.limit(5)
				.sorted()
				.collect(Collectors.joining());
		System.out.println(word);
	}
}
