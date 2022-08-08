package FinallyDemo;

public class Main {
	public static void main(String[] args) {
		// test1();
		// test2();

		try { // System.exit(0);
		} finally {
			System.out.println("finally");
		}
	}

	

	public static void test1() {
		try {
			return;
		} finally {
			System.out.println("Finally Return.");
		}
	}

	public static void test2() {
		int i = 0;
		try {
			while (i <= 10) {
				System.out.println("i: " + i);

				if (i == 3) {
					// break;
					// continue;
					System.exit(0);
				}
			}
		} finally {
			System.out.println("Break Finally.");
		}
		i++;

	}
}
