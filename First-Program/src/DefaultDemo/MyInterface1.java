package DefaultDemo;

public interface MyInterface1 {
	
	default void test() {
		System.out.println("MyInterface 1.");
	}
}
