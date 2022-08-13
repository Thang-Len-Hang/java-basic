package Assignment5;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of digits: ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter digit position " + (i + 1) + " :");
			arr[i] = sc.nextInt();
		}

		System.out.print("The number is: ");
		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.print(arr[j]);
		}
	}

}
