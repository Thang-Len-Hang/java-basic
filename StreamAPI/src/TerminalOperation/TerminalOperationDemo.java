package TerminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationDemo {

	public static void main(String[] args) {
		
		Stream.of(
				1//,2,3,4,5,6,7,8,9
				)
				.filter(i -> i > 5)
				.mapToInt(i -> i)
				.average()
				.ifPresentOrElse(a -> System.out.println("avg: "+a),
				() ->{
					System.out.println("there is no avg.");
				});
		
		
		Optional<String> foundName = Stream.of("Thomas","Dolla","Richard","Horace","David")
				.filter(s -> s.startsWith("D"))
				//.findFirst();
				.findAny();
		
		if(foundName.isPresent()) {
			String name = foundName.get();
			System.out.println("Names first start with 'D' :"+name);
		}
		
		
		List<String> sl = Arrays.asList(
				"Thomas","Dolla","Richard","Horace","David","D Boy","Dinny"
				);
		//sl.stream()
		sl.parallelStream()
			.filter(a -> a.startsWith("D"))
			//.findFirst()
			.findAny()
			.ifPresent(System.out::println);
		}
}