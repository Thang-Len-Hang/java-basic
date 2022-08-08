package MyFunctionalInterfaceDemo;

public class Main {

	public static void main(String[] args) {

		MyFunctionalInterface add = (a, b) -> a + b;
		MyFunctionalInterface sub = (a, b) -> a - b;
		MyFunctionalInterface mul = (a, b) -> a * b;
		MyFunctionalInterface div = (a, b) -> a / b;

		System.out.println("5 + 7 = " + add.calculate(5, 7));

		test((a, b) -> a * b, 8, 8);

	}

	public static void test(MyFunctionalInterface obj, int num1, int num2) {
		System.out.println(obj.calculate(num1, num2));
	}

}
