package Assignment1;

import java.util.Scanner;

public class PackagePromotion {

	public static void main(String[] args) {
		int prize = 99;
		int noOfPackage = 0;
		int amount = 0;
		double totalAmount = 0.0;
		double discount = 0.0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of packages: ");
		noOfPackage = sc.nextInt();

		if (noOfPackage < 10) {
			amount = prize * noOfPackage;
			discount = amount * 0.0;
			totalAmount = amount - discount;

			System.out.println("Amount: $" + amount);
			System.out.println("Discount: $" + discount);
			System.out.println("Total Amount after discount: $" + totalAmount);
		}

		else if (noOfPackage > 9 && noOfPackage < 20) {
			amount = prize * noOfPackage;
			discount = amount * 0.2;
			totalAmount = amount - discount;

			System.out.println("Amount: $" + amount);
			System.out.println("Discount: $" + discount);
			System.out.println("Total Amount after discount: $" + totalAmount);
		}

		else if (noOfPackage > 19 && noOfPackage < 50) {
			amount = prize * noOfPackage;
			discount = amount * 0.3;
			totalAmount = amount - discount;

			System.out.println("Amount: $" + amount);
			System.out.println("Discount: $" + discount);
			System.out.println("Total Amount after discount: $" + totalAmount);
		}

		else if (noOfPackage > 49 && noOfPackage < 100) {
			amount = prize * noOfPackage;
			discount = amount * 0.4;
			totalAmount = amount - discount;

			System.out.println("Amount: $" + amount);
			System.out.println("Discount: $" + discount);
			System.out.println("Total Amount after discount: $" + totalAmount);
		}

		else {
			amount = prize * noOfPackage;
			discount = amount * 0.5;
			totalAmount = amount - discount;

			System.out.println("Amount: $" + amount);
			System.out.println("Discount: $" + discount);
			System.out.println("Total Amount after discount: $" + totalAmount);
		}
	}

}
