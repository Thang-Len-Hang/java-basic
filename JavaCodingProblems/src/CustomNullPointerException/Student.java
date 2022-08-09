package CustomNullPointerException;
import java.util.Objects;

public class Student {

	private final String name;
	private final String address;

	public Student(String name, String address) {

		this.name = Objects.requireNonNull(name, "Name cannot be null!");
		this.address = Objects.requireNonNull(address, "Address cannot be null!");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	
	

}
