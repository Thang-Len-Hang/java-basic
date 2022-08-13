package Assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int[] newArr = new int[size + 1];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Array [" + i + "] :");
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the number to be inserted: ");
		int num = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
			newArr[i + 1] = num;
		}

		Arrays.sort(newArr);
		System.out.print("The array after insertion of " + num + " is :\n");
		for (int i = 0; i < newArr.length; i++) {
			System.out.println("Array [" + i + "] :" + newArr[i]);
		}
	}

}
