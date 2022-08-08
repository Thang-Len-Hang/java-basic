package JavaDemo;

public class MinArray {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10, 1, 45, 33, 89, 23 };
		System.out.println("Length of Array: " + arr.length);
		int min = arr[0];
		int max = arr[0];

		int i = 1;
		while (i < arr.length) {
			if (arr[i] < min) {
				min = arr[i];
			}

			else if (arr[i] > max) {
				max = arr[i];
			}
			i++;
		}
		System.out.println("The minimum number: " + min);
		System.out.println("The maximun number: " + max);
	}

}
