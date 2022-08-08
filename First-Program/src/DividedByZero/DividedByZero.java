package DividedByZero;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DividedByZero {

	public static void main(String[] args) {

		/*
		 * //RuntimeException Error
		 * 
		 * int[] arr = new int[3]; arr[4] = 23;
		 * 
		 * Integer.parseInt("A");
		 * 
		 * // Error Handling
		 * 
		 * try { Thread t = new Thread(); t.sleep(1000); FileReader reader = new
		 * FileReader(""); System.out.println(6 / 0); } catch (ArithmeticException e) {
		 * // System.out.println(e); e.printStackTrace(); } catch (IOException e) {
		 * 
		 * }
		 * 
		 * System.out.println("Print me"); }
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();

		try {
			System.out.println(3 / num);
			int[] arr = new int[4];
			arr[num] = 5;

			Integer.parseInt("a");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Print me");
	}

}
