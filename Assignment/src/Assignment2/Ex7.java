package Assignment2;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num = 0;
		double total = 0;
		int count = 0;
		do {
			System.out.print("Enter number 0 to 4 (to exit enter negative num): ");
			num = sc.nextInt();
			if (num >= 0 && num <= 4) {
				total += num;
				count++;
			}
		} while (num > 0);

		System.out.print("Average :" + total / count);
	}

}
