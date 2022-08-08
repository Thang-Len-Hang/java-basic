package JavaDemo;

import java.util.Scanner;

public class GcdInWhileLoop {

	public static void main(String[] args) {
		int num1;
		int num2;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number one: ");
		num1 = sc.nextInt();

		System.out.print("Enter number two: ");
		num2 = sc.nextInt();

		while (num1 != num2) {
			if (num1 > num2) {
				num1 -= num2;
				
			} else {
				num2 -= num1;
				
			}
		}
		System.out.println("GCD = " + num2);

	}

}
