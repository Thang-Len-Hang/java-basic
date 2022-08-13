package Assignment2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int speed = 0;
		int time = 0;
		int distance = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter speed(Mile Per Hour): ");
		speed = sc.nextInt();
		System.out.print("Enter Hours: ");
		time = sc.nextInt();

		System.out.print("Hour \t Distance Traveled \n");
		for (int i = 1; i <= time; i++) {
			distance = speed * i;
			System.out.println(i + "\t " + distance);
		}
	}

}
