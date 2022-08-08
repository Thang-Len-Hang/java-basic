package JavaDemo;

public class Array {

	public static void main(String[] args) {
		// int arr[] = new int[5];
		int[] arr = { 2, 4, 6, 8, 10, 1, 45, 33, 89, 23 };
		System.out.println("Length of Array: " + arr.length);
		int max = arr[0];

		int i = 1;
		while (i < arr.length) {
			if (arr[i] > max) {
				max = arr[i];
			}
			i++;
		}
		System.out.println("The maximum number: " + max);
	}

}
