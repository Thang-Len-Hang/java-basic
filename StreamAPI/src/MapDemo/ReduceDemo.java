package MapDemo;

import java.util.stream.Stream;

public class ReduceDemo {

	public static void main(String[] args) {
		
		Stream.of(1,2,3,4,5,6)
			.reduce((a,b) -> a+b)
			.ifPresent(System.out::println);
		
		
		System.out.println( Stream.of(1,2,3,4,5,6)
			.reduce(1, (i,j) -> i * j)
				);
	}

}
