package StaticMethodReference;

public class Main {

	public static boolean numTest(IntPredicate p, int v) {
		return p.test(v);
	}

	public static void main(String[] args) {

		boolean result;
		int num = 7;

		result = numTest(a -> StaticMethodReference.isPrime(a), num); // Lambda
		result = numTest(StaticMethodReference::isPrime, num); // Method Reference

		if (result) {
			System.out.println(num + " is prime.");
		}

		result = numTest(b -> StaticMethodReference.isEven(b), num);
		result = numTest(StaticMethodReference::isEven, num);

		if (result) {
			System.out.println(num + " is Even.");
		} else {
			System.out.println(num + " isn't Even.");
		}

		result = numTest(c -> StaticMethodReference.isPositive(c), num);
		result = numTest(StaticMethodReference::isPositive, num);

		if (result) {
			System.out.println(num + " is Positive.");
		} else {
			System.out.println(num + " isn't Positive.");
		}

		NameTest obj = a -> StaticMethodReference.greet(a);
		NameTest obj2 = StaticMethodReference::greet;
 		
		
		MyNameInterface obj3 = a -> StaticMethodReference.showName(a);
		MyNameInterface obj4 = StaticMethodReference::showName;
		obj4.show("Aung Aung");

	}

}
