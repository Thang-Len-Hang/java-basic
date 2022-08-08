package StackDemo;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		StackDemo obj = new StackDemo(3);
		obj.push(5);
		obj.push(6);
		obj.push(3);
		obj.push(7);
		obj.push(9);
		obj.push(1);
		obj.push(2);

		System.out.println(Arrays.toString(obj.nums));
		
		System.out.println(obj.pop());
		System.out.println(Arrays.toString(obj.nums));
		
		System.out.println(obj.peek());
		System.out.println(Arrays.toString(obj.nums));
	}

}
