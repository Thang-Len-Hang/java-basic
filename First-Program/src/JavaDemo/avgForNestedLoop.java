package JavaDemo;

import java.util.Scanner;

public class avgForNestedLoop {

	public static void main(String[] args) {

		int stuNum = 0;
		int numTest = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student num: ");
		stuNum = sc.nextInt();
		System.out.print("Enter test num: ");
		numTest = sc.nextInt();

		for (int i = 1; i <= stuNum; i++) {

			double total = 0;
			double score = 0;

			for (int j = 1; j <= numTest; j++) {
				System.out.print("Enter score: ");
				score = sc.nextInt();
				total += score;
			}

			System.out.println("Average score of student " + i + ": " + (total / numTest));
		}

	}

}
