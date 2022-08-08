package InstanceMethodReference;

public class Main {

	public static void main(String[] args) {

		MyIntNum obj1 = new MyIntNum(12);
		MyIntNum obj2 = new MyIntNum(16);
		

		IntPredicate ip = a -> obj1.isFactor(a);
		ip = obj1::isFactor;
		boolean test = ip.test(3);
		if (test) {
			System.out.println("3 is a factor of 12.");
		}

		ip = obj2::isFactor;
		test = ip.test(5);
		if (!test) {
			System.out.println("5 isn't a factor of 16.");
		}
		
		
		AddInt ap = (a,b) -> a + b;
		ap = obj1::add;
		System.out.println("Sum :"+ap.add(10, 1));
		
	}

}
