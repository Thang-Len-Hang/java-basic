package Assignment1;

import java.util.Scanner;

public class NameTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		String[] name = new String[size];

		int i = 0;
		while (i < name.length) {
			System.out.print("Enter name: ");
			name[i] = sc.next();
			i++;
		}

		/*
		 * Arrays.sort(name);
		 * 
		 * String largest = name[0]; String smallest = name[i - 1];
		 */

		String largest = name[0];
		String smallest = name[0];

		for (int k = 0; k < name.length; k++) {
			if (largest.compareTo(name[k]) > 0) {
				largest = name[k];
			} else if (smallest.compareTo(name[k]) < 0) {
				smallest = name[k];
			}
		}

		System.out.println(largest + " is the first alphabetically.");
		System.out.println(smallest + " is the last alphabetically.");
	}
}