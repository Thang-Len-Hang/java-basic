package TypeSafeCode;

public class Main {

	public static void main(String[] args) {

		MyClass<String, Integer, Integer> obj = new MyClass<>("Thuza", 23, 22);
		System.out.println(obj.getT());
		System.out.println(obj.getR());

		MyClass<Double, Double, Integer> obj2 = new MyClass(2.3, 2.1, 3);
		System.out.println(obj2.getT());
		System.out.println(obj2.getR());
		
		MyParentClass<String,Integer> obj3 = new MyParentClass<>("Oo",22);

	}

}
