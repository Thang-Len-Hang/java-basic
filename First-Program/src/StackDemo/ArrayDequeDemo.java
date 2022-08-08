package StackDemo;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		java.util.ArrayDeque ad = new java.util.ArrayDeque();

		ad.add(3);
		ad.add(5);
		ad.add(7);
		ad.add(9);

		System.out.println("Remove: " + ad.remove());
	
	}

}
