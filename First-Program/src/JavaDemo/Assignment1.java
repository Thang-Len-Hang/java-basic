package JavaDemo;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		int totalValue = 0;
		int penny = 0;
		int nickel = 0;
		int dime = 0;
		int quarter = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount of penny: ");
		penny = sc.nextInt();

		System.out.print("Enter Amount of nickel: ");
		nickel = sc.nextInt();

		System.out.print("Enter Amount of dime: ");
		dime = sc.nextInt();

		System.out.print("Enter Amount of quarter: ");
		quarter = sc.nextInt();

		totalValue = (penny * 1) + (nickel * 5) + (dime * 10) + (quarter * 15);
		System.out.println("Total Amount: " + totalValue);
		if (totalValue < 100) {
			System.out.println("Less than one dollar!");
		} else if (totalValue == 100) {
			System.out.println("You win the game!");
		} else {
			System.out.println("Greater than one dollar!");
		}
	}

}
