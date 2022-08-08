package Constructor;

interface MyInterface {

	void test();
}

interface AnotherInterface {

	void test(int a, int b);
}

class A{
	A(int i, int j){
		
	}
}

public class MyClass {
	public static void main(String[] args) {
		MyInterface obj = StringBuilder::new;
		obj = () -> new StringBuilder();
		
		AnotherInterface obj2 = A::new;
		obj2 = (a,b) -> new A(a,b);
	}
}
