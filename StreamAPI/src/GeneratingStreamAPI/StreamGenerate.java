package GeneratingStreamAPI;

import java.util.stream.Stream;

public class StreamGenerate {

	public static void main(String[] args) {
		
		Stream<?> stream = Stream.generate(() -> "Hello");
		stream
				.limit(3)
				.forEach(System.out::println);	
		
		
		
	}

}
