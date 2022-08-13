package Assignment5;

import java.util.Scanner;

public class Ex4 {

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

		System.out.print("Enter the position at which the number has to be added: ");
		int index = sc.nextInt();

		for (int i = 0; i <= index; i++) {
			if (i == index) {
				for (int j = index; j < arr.length; j++) {
					newArr[j + 1] = arr[j];
				}

				newArr[i] = num;

			} else {
				newArr[i] = arr[i];
			}
		}

		System.out.print("The array after insertion of " + num + " is :\n");
		for (int i = 0; i < newArr.length; i++) {
			System.out.println("Array [" + i + "] :" + newArr[i]);
		}
	}

}
