package JavaDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiscountItem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		final int prizeOfItem = 30;
		final int RANGE1 = 10;
		final int RANGE2 = 20;
		final int RANGE3 = 50;
		final double DISCOUNT1 = 0.0;
		final double DISCOUNT2 = 0.10;
		final double DISCOUNT3 = 0.15;
		final double DISCOUNT4 = 0.20;

		int noOfItem = 0;
		double discount = 0;
		int amount = 0;
		double totalAmount = 0;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Number of item: ");
		noOfItem = Integer.parseInt(in.readLine());

		if (noOfItem <= RANGE1) {
			System.out.println("Set Disount1!");
			discount = noOfItem * prizeOfItem * DISCOUNT1;
			amount = noOfItem * prizeOfItem;
			totalAmount = amount - discount;
			System.out.println("Amount: " + amount);
			System.out.println("Discount: " + discount);
			System.out.println("Total Amount: " + totalAmount);

		} else if (noOfItem <= RANGE2) {
			System.out.println("Set Disount2!");
			discount = noOfItem * prizeOfItem * DISCOUNT2;
			amount = noOfItem * prizeOfItem;
			totalAmount = amount - discount;
			System.out.println("Amount: " + amount);
			System.out.println("Discount: " + discount);
			System.out.println("Total Amount: " + totalAmount);

		} else if (noOfItem <= RANGE3) {
			System.out.println("Set Disount3!");
			discount = noOfItem * prizeOfItem * DISCOUNT3;
			amount = noOfItem * prizeOfItem;
			totalAmount = amount - discount;
			System.out.println("Amount: " + amount);
			System.out.println("Discount: " + discount);
			System.out.println("Total Amount: " + totalAmount);

		} else {
			System.out.println("Set Disount4!");
			discount = noOfItem * prizeOfItem * DISCOUNT4;
			amount = noOfItem * prizeOfItem;
			totalAmount = amount - discount;
			System.out.println("Amount: " + amount);
			System.out.println("Discount: " + discount);
			System.out.println("Total Amount: " + totalAmount);
		}
	}

}
