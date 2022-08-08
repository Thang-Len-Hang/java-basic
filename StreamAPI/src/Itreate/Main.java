package Itreate;

import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) {
		
		Stream.iterate(1, i -> i + 1)
			.limit(5)
			.forEach(System.out::println);
	}

}
