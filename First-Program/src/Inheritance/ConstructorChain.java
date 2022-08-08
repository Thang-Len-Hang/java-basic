package Inheritance;

class A {
	A() {
		System.out.println("A");
	}
}

class B extends A{
	B(){
		super();
		System.out.println("B");
	}
}

class C extends B{
	C(){
		super();
		System.out.println("C");
	}
}

public class ConstructorChain {
	public static void main(String[] args) {
		//new C();
		ChildClass obj = new ChildClass();
		obj.defaultInt = 12;
		obj.protectedInt = 4;
		obj.publicInt = 7;
	}
}
