package RangeDemo;

import static java.util.stream.IntStream.range;

public class RangeDemo {

	public static void main(String[] args) {

		// traditional way

		int result = 0;
		for (int i = 10; i < 20; i++) {
			result += i;
		}
		System.out.println("Traditional way: " + result);
		
		
		
		//for each range
		result = 0;
		for(int i: range(10,20).toArray()) {
			result += i;
		}
		System.out.println("For Each: "+result);
		
		
		
		//use stream
		System.out.println("Stream: "+range(10,20).sum());
	}

}
