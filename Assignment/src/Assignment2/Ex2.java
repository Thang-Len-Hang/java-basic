package Assignment2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int total = 0;
		int i = 1;
		while (i > 0) {
			System.out.print("Enter positive number: ");
			int num = sc.nextInt();
			if (num < 0) {
				break;
			}
			total += num;
		}
		i++;
		System.out.println("The sum: " + total);
	}

}
