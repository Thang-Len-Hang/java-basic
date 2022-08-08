package IntermidateOperation;

import java.util.List;
import java.util.stream.Stream;

public class MapDemo1 {

	public static void main(String[] args) {
		
		int num = 100;
		Stream.of(1,2,3,4,5,6,7,8)
			.filter(i -> i > 5)
			.map(i -> i + num)
			.forEach(System.out::println);
		
		
		List<String> fruits = List.of("Apple","Orange","Mango");
		List<String> animals = List.of("Monkey","Tiger");
		
		Stream<List<String>> streams = Stream.of(fruits,animals);
		
		streams
			.flatMap(i -> i.stream())
			.forEach(System.out::println);
		
		
		Stream.of(1,2,3)
			.flatMap(i ->
				Stream.of("Thuza","Khaing","Hlaing"))
			.forEach(System.out::println);
		
	}

}
