package JavaDemo;

import java.util.Scanner;

public class ArrayStringExe {

	public static void main(String[] args) {
		int capacity = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter capacity of array: ");
		capacity = sc.nextInt();

		String[] name = new String[capacity];
		int[] wHour = new int[capacity];
		int[] wRate = new int[capacity];
		int[] salary = new int[capacity];
		double[] tax = new double[capacity];
		double[] netPay = new double[capacity];

		int totalwHour = 0;
		int totalwRate = 0;
		int totalSalary = 0;
		double totaltax = 0.0;
		double totalnetPay = 0.0;

		for (int i = 0; i < name.length; i++) {
			System.out.print("Enter name: ");
			name[i] = sc.next();

			System.out.print("Enter work hour: ");
			wHour[i] = sc.nextInt();
			totalwHour += wHour[i];

			System.out.print("Enter work rate: ");
			wRate[i] = sc.nextInt();
			totalwRate += wRate[i];

			salary[i] = wHour[i] * wRate[i];
			totalSalary += salary[i];

			tax[i] = salary[i] * 0.02;
			totaltax += tax[i];

			netPay[i] = salary[i] - tax[i];
			totalnetPay += netPay[i];

		}
		System.out.println("Names \t WHour \t WRate \t Salary  Tax \t NetPay");

		for (int k = 0; k < capacity; k++) {
			System.out.println(name[k] + " \t " + wHour[k] + " \t " + wRate[k] + " \t " + salary[k] + " \t " + tax[k]
					+ " \t " + netPay[k] + " \t ");
		}

		System.out.println("Total \t " + totalwHour + " \t " + totalwRate + " \t " + totalSalary + " \t " + totaltax
				+ " \t " + totalnetPay);

	}

}
