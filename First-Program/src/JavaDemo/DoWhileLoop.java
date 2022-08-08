package JavaDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner s = new Scanner(System.in);
		String keepGoing = "";
		double commision = 0.0;
		double COMMISION_RATE = 0.10;
		double sales = 0;

		do {
			System.out.print("Enter sale count: ");
			sales = s.nextInt();
			commision = sales * COMMISION_RATE;
			System.out.println("Commision: " + commision);

			System.out.print("Continue? Enter 'y': ");
			keepGoing = s.next();
			
		} while (keepGoing.equalsIgnoreCase("y"));
	}

}
