package IteratorPattern;

import java.util.HashSet;

public class Iterator {
	
	public static void main(String[] args) {
		
		HashSet<Integer> al = new HashSet<>();
		al.add(1);
		al.add(2);
		al.add(3);
		
		java.util.Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			if(i == 2) {
				itr.remove();
			}
		}
		
		System.out.println(al);
	}
}
