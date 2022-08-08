package JavaDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Salary {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int salary = 0;
		int year = 0;
		System.out.print("Enter salary: ");
		salary = Integer.parseInt(in.readLine());

		if (salary >= 35000) {
			System.out.print("Enter work on year: ");
			year = Integer.parseInt(in.readLine());
			if (year >= 2) {
				System.out.print("You got loan!");
			} else {
				System.out.print("You yan on work is not qualified!");
			}

		} else {
			System.out.print("Sorry, you cannot get loan!");
		}

	}

}
