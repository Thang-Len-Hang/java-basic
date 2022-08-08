package StaticMethodReference;

public class StaticMethodReference {

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= n / i; i++) {
			if ((n % i) == 0) {
				return false;
			}
		}
		return true;
	}

	public static String greet(String name) {
		return "Hello" + name;
	}

	public static void showName(String name) {
		try {
			char[] names = name.toCharArray();
			for (char n : names) {
				System.out.print(n);
				Thread.sleep(700);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static boolean isEven(int n) {
		return (n % 2) == 0;
	}

	public static boolean isPositive(int n) {
		return n > 0;
	}
}
