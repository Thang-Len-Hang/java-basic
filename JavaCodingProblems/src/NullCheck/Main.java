package NullCheck;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1,null,2,null,3,null,4,null,5);
		
		/*
		 * int sum = list .stream() .filter(Objects::nonNull)
		 * //.peek(System.out::println) .mapToInt(Integer::intValue) .sum();
		 * System.out.println("Sum: "+sum);
		 */
		
		boolean isNonNull = list.stream()
				.anyMatch(Objects::isNull);
				System.out.println(isNonNull);
				
				int sum = 0;
				for(Integer ints:list) {
					if(Objects.nonNull(ints)) {
						sum += ints;
					}
				}
				System.out.println("Sum: "+sum);
	}

}
