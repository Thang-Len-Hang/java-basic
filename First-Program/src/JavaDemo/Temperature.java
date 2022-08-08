package JavaDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Temperature {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter temperature: ");
		int temp = Integer.parseInt(in.readLine());

		if (temp < 30) {
			System.out.print("A little cool!");

		} else {
			System.out.print("A good weather!");
		}

	}

}
