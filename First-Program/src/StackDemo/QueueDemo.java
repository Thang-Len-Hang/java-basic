package StackDemo;

import java.util.EmptyStackException;

public class QueueDemo {
	int front;
	int back;

	int[] nums;

	public QueueDemo(int capacity) {
		nums = new int[capacity];
	}

	public void add(int data) {
		if (back == nums.length) {
			int[] newArray = new int[2 * nums.length];
			for (int i = 0; i < nums.length; i++) {
				newArray[i] = nums[i];
			}
			nums = newArray;
		}
		nums[back] = data;
		back++;
	}

	public int remove() {
		if (size() == 0) {
			throw new EmptyStackException();
		}
		int data = nums[front];
		front++;

		if (size() == 0) {
			front = 0;
			back = 0;
		}
		return data;
	}

	public int size() {
		return back - front;
	}

	public int peek() {
		if (size() == 0) {
			throw new EmptyStackException();
		}

		return nums[front];
	}

	public void print() {
		for (int i = front; i < back; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
}
