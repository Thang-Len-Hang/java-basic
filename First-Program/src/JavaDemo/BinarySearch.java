package JavaDemo;

import static JavaDemo.BubbleSort.bubbleSort;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 5, 3, 2, 1, 4 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

		int searchNum = 4;
		int foundIndex = binarySearch(arr, searchNum);

		if (foundIndex < 0) {
			System.out.println(searchNum + " is not found!");
		} else {
			System.out.println(searchNum + " is found at " + foundIndex);
		}
	}

	public static int binarySearch(int[] arr, int searchNum) {
		int hi = arr.length;
		int lo = 0;
		while (lo < hi) {
			int i = (hi + lo) / 2;
			if (arr[i] == searchNum) {
				return i;
			} else if (arr[i] < searchNum) {
				lo = i + 1;
			} else {
				hi = i;
			}
		}
		return -1;
	}
}
