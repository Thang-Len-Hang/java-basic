package JavaDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grade {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int score = 0;
		System.out.print("Enter Score: ");
		score = Integer.parseInt(in.readLine());

		if (score < 60) {
			System.out.println("Your grade is F.");
		} else if (score < 70) {
			System.out.println("Your grade is D.");
		} else if (score < 80) {
			System.out.println("Your grade is C.");
		} else if (score < 90) {
			System.out.println("Your grade is B.");
		} else {
			System.out.println("Your grade is A.");
		}

	}

}
