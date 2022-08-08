package JavaDemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySizeInput {

	public static void main(String[] args) {
		int capacity = 0;
		int sum = 0;
		double mean = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter capacity of array: ");
		capacity = sc.nextInt();
		int[] arr = new int[capacity];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter number: ");
			int num = sc.nextInt();
			arr[i] = num;

			sum += arr[i];
			mean = sum / capacity;

		}

		/*****************************
		 * Minimum number search
		 ******************************************/

		int min = arr[0];
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < min) {
				min = arr[j];
			}
		}

		System.out.print("Element in array: " + Arrays.toString(arr) + "\n");
		System.out.println("The sum of array element: " + sum);
		System.out.println("The mean of array element: " + mean);
		System.out.println("The minimum number: " + min);

		/********************************
		 * Minimum index search
		 ********************************/

		int k = 0;
		boolean found = false;
		int searchNum = 3;
		while (!found && k != arr.length) {
			found = arr[k] == searchNum;
			k++;
		}
		if (!found) {
			System.out.println(searchNum + " not found!");
		} else {
			System.out.println(searchNum + " found at " + (k - 1) + " !");
		}

		/**************************************
		 * Sorting number
		 *****************************/

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

		/********************************* Maximum search ***************************/
		/*
		 * int max = arr[0]; for (int j = 0; j < arr.length; j++) { if (arr[j] > max) {
		 * max = arr[j]; } }
		 */

		System.out.println(Arrays.toString(arr));
		System.out.println("The second largest num: " + arr[arr.length - 2]); // The second largest num
	}

}
