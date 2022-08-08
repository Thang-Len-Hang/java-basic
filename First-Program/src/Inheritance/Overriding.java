package Inheritance;

class LivingThings { 
	public void walk() {
		System.out.println("Living Thing Walk...");
	}
}

class HumanBeing extends LivingThings {
	@Override
	public void walk() {
		System.out.println("Human Walk");
	}
}

class Lion extends LivingThings {
	@Override
	public void walk() {
		System.out.println("Lion Walk");
	}
}

public class Overriding {
	public static void main(String[] args) {
		LivingThings obj = new HumanBeing();
		obj.walk();  //Overriding
		test(obj);  //Overloading ---> base on type ---> CombineTime 
	}
	
	public static void test(LivingThings livingThings) {
		System.out.println("Living Things");
	}
	
	public static void test(Lion lion) {
		System.out.println("Lion");
	}
	
	public static void test(HumanBeing humanBeing) {
		System.out.println("HumanBeing");
	}
}
