package JavaDemo;

import java.util.Scanner;

public class HourMinSec {

	public static void main(String[] args) {

		int day = 0;
		int hour = 0;
		int minutes = 0;
		int sec = 0;
		int noOfTime = 0;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount of time: ");
		noOfTime = sc.nextInt();

		if (noOfTime >= 84600) {
			day = noOfTime / 84600;
			hour = (noOfTime % 84600) / 3600;
			minutes = ((noOfTime % 84600) % 3600) / 60;
			sec = (((noOfTime % 84600) % 3600)) % 60;
			System.out.println(
					"The result is: " + day + " days " + hour + " hours " + minutes + " Minutess  " + sec + " Seconds");
		}

		else if (noOfTime >= 3600) {
			hour = noOfTime / 3600;
			minutes = (noOfTime % 3600) / 60;
			sec = ((noOfTime % 3600)) % 60;
			System.out.println("The result is: " + hour + " hours " + minutes + " Minutess  " + sec + " Seconds");
		}

		else if (noOfTime >= 60) {
			minutes = noOfTime / 60;
			sec = (noOfTime % 60);
			System.out.println("The result is: " + minutes + " Minutess  " + sec + " Seconds");
		}

		else {
			System.out.println("The result is: " + noOfTime + " Seconds");
		}

	}

}
