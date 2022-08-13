package Assignment2;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of work year: ");
		int noOfWorkYear = sc.nextInt();

		System.out.print("Enter amount: ");
		int saveAmount = sc.nextInt();

		double totalSaveAmount = 0;
		for (int i = 0; i <= noOfWorkYear; i++) {
			totalSaveAmount += saveAmount;
		}
		System.out.println("Annual save amount: " + totalSaveAmount);

		int count = 0;

		while(totalSaveAmount > 50000) {

			totalSaveAmount -= 50000 ;
			totalSaveAmount += (totalSaveAmount * 0.03);
			
			count++;
			System.out.println( count+ " year: " + totalSaveAmount);

			if (count == 40 ) {
				break;
			}
			
		}
		System.out.println("Total save amount after "+count+" years: "+totalSaveAmount);
	}

}
