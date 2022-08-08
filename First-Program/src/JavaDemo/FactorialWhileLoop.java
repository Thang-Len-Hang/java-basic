package JavaDemo;

import java.util.Scanner;

public class FactorialWhileLoop {

	public static void main(String[] args) {

		int n;
		int factorial = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		n = sc.nextInt();

		int i = 1;
		while (i <= n) {
			factorial *= i;
			i++;
		}
		System.out.print("Factorial of " + n + " : " + factorial);
	}

}
