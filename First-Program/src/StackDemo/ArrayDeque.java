package StackDemo;

public class ArrayDeque {

	public static void main(String[] args) {
		java.util.ArrayDeque ad = new java.util.ArrayDeque();
		
		ad.push(2);
		ad.push(3);
		ad.push(5);
		ad.push(7);
		ad.push(9);
		
		System.out.println(ad);
		System.out.println("Pop: "+ad.pop());
		
		System.out.println(ad);
		System.out.println("Peek: "+ad.peek());
	}

}
