package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class calSalary {

	public static void main(String[] args) {
		int day = 0;
		double salary = 0;
		double totalSalary = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of days: ");
		day = sc.nextInt();
		
		int i = 0;
		while(i < day) {
			salary = Math.pow(2, i);
			totalSalary += salary;
			System.out.println(i+1 +" days salary: $"+salary / 100);
			i++;
		}
		System.out.println("The total pay: $"+totalSalary / 100);
	}

}
