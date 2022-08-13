package Assignment2;

public class Ex1 {

	public static void main(String[] args) {

		double CalPerMin = 3.9;

		for (int i = 10; i <= 30; i += 5) {
			double temp = i * CalPerMin;
			System.out.println("Number of calories burned after " + i + "  : " + temp);
		}
	}

}
