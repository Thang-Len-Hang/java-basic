package DuckingDemo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws EnterNegativeException,EnterZeroException {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num: ");
		int num = sc.nextInt();
		if (num == 0) {
			try {
				throw new EnterZeroException(num + " must not be zero!");
			} catch (EnterZeroException e) {
				System.out.println(e.getMessage());
			}
		}else if(num < 0 ) {
			throw new EnterNegativeException(num+" must not be negative!");
		}else {
			System.out.println("You enter: "+num);
		}

	}

}
