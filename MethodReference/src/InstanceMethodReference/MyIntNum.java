package InstanceMethodReference;

public class MyIntNum {
	
	private int num;
	
	public MyIntNum(int num) {
		super();
		this.num = num;
	}
	
	public boolean isFactor(int n) {
		return this.num % n == 0;
	}
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
}
