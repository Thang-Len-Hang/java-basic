package Assignment2;

public class Ex6 {

	public static void main(String[] args) {

		int classRoom = 3;
		int grade = 9;
		int monthOfYear = 9;
		int total = 0;

		for (int i = 1; i <= classRoom; i++) {
			for (int j = 0; j < grade; j++) {
				for (int k = 1; k <= monthOfYear; k++) {
					if (j == 0) {
						System.out.println(" Class room " + i + " grade " + j + ", " + k + " month: $" + 80);
						total += 80;

					} else {
						System.out.println(" Class room " + i + " grade " + j + ", " + k + " month: $" + 60);
						total += 60;
					}
				}

				System.out.println("Total amount: $" + total);
				total = 0;
				System.out.println("/***************************************************************/");
			}
		}

	}

}
