package VisitorPattern;

public class VisiterA implements IVisiter {

	@Override
	public void visit(ConcreteVisitable1 concreteVisitable1) {
		System.out.println("Visiter A visit concreteVisitable1");
	}

	@Override
	public void visit(ConcreteVisitable2 concreteVisitable2) {
		System.out.println("Visiter A visit concreteVisitable2");

	}

}
