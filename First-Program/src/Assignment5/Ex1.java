package Assignment5;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];

		int max = 0;
		int min = 0;
		int num = 0;
		int count = 0;

		do {

			System.out.print("Enter number: ");
			num = sc.nextInt();
			arr[count++] = num;

			if (count == arr.length) {
				int newArr[] = new int[arr.length * 2];
				for (int i = 0; i < arr.length; i++) {
					newArr[i] = arr[i];
				}
				arr = newArr;
			}

			for (int j = 0; j < count - 1; j++) {

				if (max < arr[j]) {
					max = arr[j];
				}

				else {
					min = arr[j];
				}

			}

		} while (num != -99);

		System.out.println("The largest num: " + max);
		System.out.println("The smallest num: " + min);
	}

}
