package Itreate;

import java.util.Scanner;

public class FibonacciTraditional {

	public static void main(String[] args) {

		int firstNum = 0;
		int secNum = 1;
		int result = 0;
		int userNum = 0;
		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num in Fibonacci: ");
		userNum = sc.nextInt();
		
		while (count < userNum) {
			result = firstNum + secNum;
			count++;

			firstNum = secNum;
			secNum = result;
			System.out.println("\nFibonacci No.[" + count + "] " + result);
	
		}

		sc.close();
	}

}
/*
 * 1. result = 1, f = 0, s=1, count = 1, f = 1, s = 1
 * 2. result = 2, count = 2, f = 1, s = 2
 * 3. result = 3, count = 3, f = 2, s = 3
 * 4. result = 5, count = 4, f = 3, s = 5
 * 5. result = 8, count = 5, f = 5, s = 8
 * .
 * .
 * .
 * .
 */
