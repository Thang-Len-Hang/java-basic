package JavaDemo;

import java.util.*;

public class ArraySorting {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10, 9, 1, 3, 7, 5, 11 };
		int num;

		System.out.println(" Before Sorting");
		for (int a : arr) {
			System.out.print(" " + a);
		}

		int i = 1;
		while (i < arr.length) {
			num = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > num) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = num;
			i++;
		}
		System.out.println("\n After Sorting");
		for (int b : arr) {
			System.out.print(" " + b);
		}

	}

}
