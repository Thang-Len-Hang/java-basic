package JavaDemo;

import java.util.Arrays;

public class evenNumTest {

	public static void main(String[] args) {

		int[] arr = new int[100];
		int size = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				arr[size++] = i;
			}
		}
		/*for (int b : arr) {
			System.out.print(" " + b);
		}*/
		System.out.print(Arrays.toString(arr));
	}

}
