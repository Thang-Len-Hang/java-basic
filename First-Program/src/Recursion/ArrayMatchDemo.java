package Recursion;

public class ArrayMatchDemo {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 4, 3, 4 };

		for (int i = 1; i <= 4; i++) {
			System.out.println("arrayMatch(i,a,b) for i = " + i + " is " + arrayMatch(i, arr1, arr2));
		}
	}

	public static boolean arrayMatch(int n, int[] a, int[] b) {
		boolean result;
		if (n == 0) {
			result = true;
		} else {
			result = a[n - 1] == b[n - 1] && arrayMatch(n - 1, a, b);
		}
		return result;
	}

}
