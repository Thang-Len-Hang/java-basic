package Recursion;

public class FactorialRecursive {

	public static void main(String[] args) {
		System.out.println("5 factorial: " + factorial(5));
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}
/**
 1. 5 * factorial(4) = 120
 2.	4 * factorial(3) = 24
 3.	3 * factorial(2) = 6
 4.	2 * factorial(1) = 2
 5.	1 * factorial(0) = 1
 */