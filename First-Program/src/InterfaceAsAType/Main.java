package InterfaceAsAType;

public class Main {

	public static void main(String[] args) {
		//MyInterface obj = new A();
		//MyInterface obj = new B();
		//MyInterface obj = new C();
		//obj.doSomething();
		
		test(new B());
		}
	
	public static void test(MyInterface obj) {
		obj.doSomething();
	}

}
