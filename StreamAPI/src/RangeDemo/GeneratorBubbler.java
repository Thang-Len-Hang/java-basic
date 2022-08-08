package RangeDemo;

import java.util.stream.Stream;

public class GeneratorBubbler {
	
	public static void main(String[] args) {
		
		Stream
			.generate(Bubble::bubbler)
			.limit(5)
			.forEach(System.out::println);
	}
}

