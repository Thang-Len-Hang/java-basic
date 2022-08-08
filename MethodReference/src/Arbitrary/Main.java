package Arbitrary;

public class Main {

	public static void main(String[] args) {
			
		IntPredicate obj1 = (a,b) -> a.isFactor(b);
		obj1 = MyIntNum::isFactor;
		boolean test = obj1.test(new MyIntNum(16), 2);
		
		
		IName obj2 = (a,b) -> a.greet(b);
		obj2 = MyIntNum::greet;
		String name = obj2.greet(new MyIntNum(2)," Aung");
		System.out.println(name);
				
		
	}

}
