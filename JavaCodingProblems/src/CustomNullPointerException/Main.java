package CustomNullPointerException;
import java.util.Objects;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		
		Student s = new Student("Thaw Thaw","Dream Land");
		System.out.println(s);
		
		String s1 = "Hello";
		System.out.println(Objects.requireNonNullElse(s1, "No name"));
		System.out.println(Objects.requireNonNullElseGet(s1, () -> "No Name"));
		//System.out.println(notNonNullValue(s1,IllegalArgumentException::new));
	}
	
	public static <T, X extends Throwable> T 
			notNonNullValue(T obj, 
			Supplier<? extends X> exception)
			throws X{
		if(obj != null) {
			return obj;
		}else {
			throw exception.get();
		}
	}

}
