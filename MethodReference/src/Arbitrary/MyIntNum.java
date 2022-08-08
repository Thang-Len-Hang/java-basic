package Arbitrary;

public class MyIntNum {

	private int num;

	public MyIntNum(int num) {
		super();
		this.num = num;
	}

	public boolean isFactor(int n) {
		return num % n == 0;
	}

	public String greet(String name) {
		return "Hello!" + name;
	}
}
