package GeneratingStreamAPI;

import java.util.Arrays;
import java.util.stream.*;

public class ArrayStream {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8};
		IntStream stream = Arrays.stream(arr);
		
		int sum = stream.filter(a -> a > 5)
				.sum();
		System.out.println(sum);
	}

}
