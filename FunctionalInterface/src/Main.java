import java.util.function.*;

public class Main {
	public static void main(String[] args) {

		Supplier<RuntimeException> obj = RuntimeException::new;

		RuntimeException obj2 = getInstance(RuntimeException::new);
		// RuntimeException obj2 = getInstance(() -> new RuntimeException());
		
		
		Consumer<String> obj3 = s -> System.out.print(s);
		Consumer<String> obj4 = System.out::println;
		obj3.accept("Hello:");
		
		
		Function<String,Integer> obj5 = a -> a.length();
		System.out.println("\nLength: "+obj5.apply("Hello"));
		
		
		Predicate<Integer> predicate = a -> a > 10;
		System.out.println(predicate.test(15));
		
		
		UnaryOperator<String> unaryOperator = s -> "Hello " + s;
		System.out.println(unaryOperator.apply("Aung"));
		
		
		
	}

	public static <T> T getInstance(Supplier<T> t) {
		return t.get();
	}
}
