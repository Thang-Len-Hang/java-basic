package JavaDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class ThreeNunbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter num1: ");
		int num1 = Integer.parseInt(in.readLine());

		System.out.print("Enter num2: ");
		int num2 = Integer.parseInt(in.readLine());

		System.out.print("Enter num3: ");
		int num3 = Integer.parseInt(in.readLine());

		/*int max = 0;

		max = (num1 > num2) ? num1 : num2;
		max = (max > num3) ? max : num3;
		
		System.out.println("The largest number is: " + max);*/
		
		int min = 0;

		min = (num1 < num2) ? num1 : num2;
		min = (min < num3) ? min : num3;
		
		System.out.println("The smallest number is: " + min);

	}

}
