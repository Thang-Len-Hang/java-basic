package JavaDemo;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 2, 1 };
		bubbleSort(arr);
		System.out.print(Arrays.toString(arr));
	}

	public static void bubbleSort(int[] arr) {
		int i = 0;
		int temp = 0;
		while (i < arr.length) {
			int j = 1;
			while (j < arr.length) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
			i++;
		}

	}

}
