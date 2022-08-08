package TerminalOperation;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		//String s1 = null;
		String s1 = "Java is cool";
		//Optional<String> stringOptional = s1 != null ? Optional.of(s1) : Optional.empty();
		//stringOptional.ifPresent(System.out::println);
		Optional<String> stringOptional = Optional.ofNullable(s1);
		stringOptional.ifPresentOrElse(System.out::println,	
				() ->{
					System.out.println("s1 is empty or null");
				});
		

		Optional<Double> avg = average();
		 
		System.out.println("or(): "+avg.or(() -> Optional.of(Double.MAX_VALUE)));
		System.out.println("orElse(): "+avg.orElse(Double.NaN));
		System.out.println("orElseGet(): "+avg.orElseGet(() -> 3.5));
		System.out.println("orElseThrow(): "+avg.orElseThrow(RuntimeException::new));
		
		if (avg.isPresent()) {
			System.out.println("avg: " + avg.get());
		} else {
			System.out.println(avg);
		}
	}

	public static Optional<Double> average(int... nums) {
		if (nums.length == 0) {
			return Optional.empty();
		}

		double sum = 0;
		for (int num : nums) {
			sum += num;
		}

		return Optional.of((double) sum / nums.length);
	}

}
