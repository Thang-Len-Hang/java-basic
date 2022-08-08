package VisitorPattern;

public class ConcreteVisitable1 implements IVisitable {

	@Override
	public void accept(IVisiter IVisiter) {
		IVisiter.visit(this);
	}
	
	
}
