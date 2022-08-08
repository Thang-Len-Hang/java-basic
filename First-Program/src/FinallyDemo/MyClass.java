package FinallyDemo;

public class MyClass implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("My Class Closed");
		throw new ArithmeticException("From MyClass");
	}
	
	public static void main(String[] args) {
		
		try (MyClass obj = new MyClass()) {
			throw new IllegalArgumentException("From main class");
		} catch (Exception e) {
			System.out.println(e);
			for (Throwable t : e.getSuppressed()) {
				System.out.println("Suppressed Exception: " + t);
			}
		}
		
		
	}
}
