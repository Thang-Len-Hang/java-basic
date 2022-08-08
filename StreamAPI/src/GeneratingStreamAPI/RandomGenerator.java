package GeneratingStreamAPI;

import java.util.*;
import java.util.stream.Stream;

public class RandomGenerator {

	public static <T> void show(Stream<T> stream) {
		stream
			.limit(4)
			.forEach(System.out::println);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	public static void main(String[] args) {
		
		Random random = new Random(47);
		show(random.ints().boxed());
		show(random.longs().boxed());
		show(random.doubles().boxed());
		
		
		// Control lower and upper bound
		
		show(random.ints(10,100).boxed());
		show(random.ints(2).boxed());
		show(random.ints(3,3,9).boxed());
		
	}
}
