package JavaCollectionInterfaceAndImplementationDemo;

import java.util.ArrayList;
import java.util.HashSet;

public class ITerator {
	public static void main(String[] args) {

		//ArrayList<Integer> al = new ArrayList<>();
		HashSet<Integer> al = new HashSet<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println(al);
		
		//al.add(3);
		//System.out.println(al);
		
		
		/*
		 * for(Integer i : al) { System.out.println(i); if(i == 2) { al.remove(2); } }
		 */
		

		/*
		 * for (int i = 0; i < al.size(); i++) { System.out.println(al.get(i)); }
		 */
	}
}
