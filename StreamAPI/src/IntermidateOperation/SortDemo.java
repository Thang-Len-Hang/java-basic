package IntermidateOperation;

import java.util.stream.Stream;

public class SortDemo {

	public static void main(String[] args) {
		
		Stream.of(
				3,7,4,3,1,5
				)
		.mapToInt(i -> i)
		.distinct()
		.sorted()
		.forEach(a -> System.out.print(a+" "));
	}

}
