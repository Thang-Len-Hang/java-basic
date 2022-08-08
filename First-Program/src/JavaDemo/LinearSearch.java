package JavaDemo;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10, 9, 1, 45, 33, 89, 23 };

		int i = 0;
		int searchNum = 20;
		while (i != arr.length && arr[i] != searchNum) {
			i++;
		}
		/* Example
		 * 1. i = 0, 3 , i++
		 * 2. i = 1, 4, i++
		 * .
		 * .
		 * .
		 * .
		 * */
		if (i == arr.length) {
			System.out.println(searchNum + " not found!");
		} else {
			System.out.println(searchNum + " found at " + i+" !");
		}
	}

}
