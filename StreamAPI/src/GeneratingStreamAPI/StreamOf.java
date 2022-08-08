package GeneratingStreamAPI;

import java.util.*;
import java.util.stream.Stream;

public class StreamOf {
	
	public static void main(String[] args) {
		
		Stream.of(
				new Bubble(1),new Bubble(2),new Bubble(3)
				).forEach(System.out::println);
		
		Stream.of("Java","is","cool")
				.forEach(System.out::println);
		
		Stream.of(3.233443,4.224322,6.1223443)
		.forEach(System.out::println);
		
		List<Bubble> bubbles = List.of(
				new Bubble(1),
				new Bubble(2),
				new Bubble(3)
				);
		System.out.println( bubbles.stream()
						.mapToInt(Bubble::getI)
						.sum());
		
		
		Set<String> words = new LinkedHashSet<>(Arrays.asList( // HashSet is rapid but no order
				"Life is beautiful".split(" ")
				));
				
				words.stream()
							.map(w -> w + " ")
							.forEach(System.out::println);
				
		
		Map<String,Double> map = new LinkedHashMap<>();
		map.put("pi", 3.1415);
		map.put("e", 2.765);
		map.put("phi", 4.445);
		map.entrySet()
					.stream()
					.map(e -> e.getKey() +" :"+e.getValue())
					.forEach(System.out::println);
	}
}
