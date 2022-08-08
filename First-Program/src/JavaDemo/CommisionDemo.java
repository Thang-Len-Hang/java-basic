package JavaDemo;

import java.util.Scanner;

public class CommisionDemo {

	public static void main(String[] args) {

		String keepGoing = "y";
		double COMMISION_RATE = 0.01;
		double sales = 0;

		while (keepGoing.equals("y")) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter sale count: ");
			sales = sc.nextInt();
			double commision = sales * COMMISION_RATE;
			System.out.println("Commision: " + commision);
			
			System.out.print("Continue? Enter 'y': ");
			keepGoing = sc.next();
		}
		
	}

}
