package VisitorPattern;

public class ConcreteVisitable2 implements IVisitable {

	@Override
	public void accept(IVisiter IVisiter) {
		IVisiter.visit(this);
	}
	
	
}
