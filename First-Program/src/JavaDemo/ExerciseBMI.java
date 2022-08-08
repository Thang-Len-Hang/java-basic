package JavaDemo;

import java.util.Scanner;

public class ExerciseBMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double weight = 0.0;
		double height = 0.0;
		double BMI = 0.0;
		System.out.print("Enter Weight: ");
		weight = sc.nextDouble();

		System.out.print("Enter Height: ");
		height = sc.nextDouble();

		BMI = (weight * 703) / (height * height);

		System.out.println("Body mass index(BMI): " + BMI);

		if (BMI < 18.5) {
			System.out.println("Under Weight! (Less than 18.5)");
		} else if (BMI > 18.5 && BMI < 25) {
			System.out.println("Normal! (Between18.5 and 25)");
		} else {
			System.out.println("Over Weight! (Greater than 25 )");
		}

	}

}
