package Assignment2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of year: ");
		int noOfYear = sc.nextInt();

		double totalRainfall = 0;
		double totalYearRainfall = 0;
		for (int i = 1; i <= noOfYear; i++) {
			for (int j = 1; j <= 12; j++) {
				System.out.print("Enter inches of rainfall " + j + " month of " + i + " Year: ");

				int inchesRainfall = sc.nextInt();
				totalRainfall += inchesRainfall;
				totalYearRainfall += inchesRainfall;
			}

			System.out.println(i + " Year Total Rainfall: " + totalRainfall);
			System.out.println(i + " Year Average Rainfall: " + totalRainfall / (12));
			totalRainfall = 0;
		}
		System.out.println(noOfYear+" Year Total Rainfall: " + totalYearRainfall);
		System.out.println(noOfYear + " Year Average Rainfall: " + totalYearRainfall / (12 * noOfYear));
	}

}
