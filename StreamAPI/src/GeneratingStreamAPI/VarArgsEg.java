package GeneratingStreamAPI;

import java.util.stream.Stream;

public class VarArgsEg {
	
	public static void main(String[] args) {
		
		Stream.of();
		
		test(2,6);
		test1(1,2,3,4,5);
	}
	
	public static void test(int i, int j) {
		
	}
	
	public static void test1(int...i) { // var args must be the last one in parameter (zero or more than parameter)
		for(int num:i) {
			System.out.println(num); // var args is array
		}
	}
}
