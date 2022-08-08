package Inheritance;

class Parent {
	int num = 10;

	Parent() {
		test();
	}

	public void test() {
		System.out.println(num);
	}
}

public class MyClass1 extends Parent {
	int num = 100;

	MyClass1() {
		super();
	}

	public void test() {
		System.out.println(num);
	}

	public static void main(String[] args) {
		MyClass1 obj = new MyClass1();
		obj.test();
	}
}
