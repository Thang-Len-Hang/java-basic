package StackDemo;

import java.util.EmptyStackException;

public class StackDemo {
	int[] nums;

	int top;

	public StackDemo(int capacity) {
		nums = new int[capacity];
	}

	public void push(int data) {

		if (top == nums.length) {
			int[] newArray = new int[2 * nums.length];
			for (int i = 0; i < nums.length; i++) {
				newArray[i] = nums[i];
			}

			nums = newArray;
		}
		nums[top++] = data;
	}

	public int peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return nums[top - 1];
	}

	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		int data = nums[--top];
		nums[top] = 0;
		return data;
	}

	public boolean isEmpty() {
		return top == 0;
	}
}
