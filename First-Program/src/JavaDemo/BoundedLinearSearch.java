package JavaDemo;

public class BoundedLinearSearch {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10, 9, 1, 45, 33, 89, 23 };

		int i = 0;
		boolean found = false;
		int searchNum = 23;
		while (!found && i != arr.length) {
			found = arr[i] == searchNum;
			i++;
		}
		if (!found) {
			System.out.println(searchNum + " not found!");
		} else {
			System.out.println(searchNum + " found at " + (i - 1) + " !");
		}
	}

}
