package Assignment1;

import java.util.Scanner;

public class MinMaxArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int arrSize = sc.nextInt();
		int[] arr = new int[arrSize];

		int i = 0;
		while (i < arr.length) {
			System. out.print("Enter number: ");
			arr[i] = sc.nextInt();
			i++;
		}

		int min = arr[0];
		int max = arr[0];

		int j = 0;
		while (j < arr.length) {
			if (arr[j] < min) {
				min = arr[j];
			}

			else if (arr[j] > max) {
				max = arr[j];
			}
			j++;
		}

		System.out.println("The largest number: " + max);
		System.out.print("The smallest number: " + min);
	}

}
