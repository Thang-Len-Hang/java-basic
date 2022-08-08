package VisitorPattern;

public class Main {

	public static void main(String[] args) {
		
		IVisitable visitable1 = new ConcreteVisitable1();
		IVisitable visitable2 = new ConcreteVisitable2();
		
		IVisiter iVisiter = new VisiterA();
		visitable1.accept(iVisiter);
	}

}
