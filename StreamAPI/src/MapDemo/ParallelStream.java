package MapDemo;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		
		int loop = 5000000;
		int threadHold = 500000;
		long date1;
		long date2;
		
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < loop; i++) {
			list.add(i);
		}
		
		date1 = System.nanoTime();
		list.stream().filter(i -> i > threadHold);
		date2 = System.nanoTime();
		
		long elipseTime = date2 - date1;
		System.out.println("sequential stream: "+ elipseTime +" milliseconds.");
		
		date1 = System.nanoTime();
		list.parallelStream().filter(j -> j > threadHold);
		date2 = System.nanoTime();
		
		elipseTime = date2 - date1;
		System.out.println("parallel stream: "+ elipseTime +" milliseconds.");
	}

}
