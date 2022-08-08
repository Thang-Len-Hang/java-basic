package ThisAndSuperDemo;

public class MyClass {
	private String name;
	private String phoneNum;
	private String address;
	private int age;

	public MyClass() {
		name = "Hang";
		phoneNum = "22222";
		address = "Yangon";
		age = 22;
	}

	public MyClass(String name) {
		this.name = name;
	}

	public MyClass(String name, String phoneNum) {
		this(name);
		this.phoneNum = phoneNum;
	}

	public MyClass(String name, String phoneNum, String address) {
		this(name, phoneNum);
		this.address = address;

	}

	public MyClass(String name, String phoneNum, String address, int age) {
		this(name, phoneNum, address);
		this.age = age;

	}
}
