package TemplateMethodPattern;

public class NewYorkPizza extends TemplatePizza{

	@Override
	public void prepare() {
		System.out.println("NewYork Pizza Prepared.");
		
	}

	@Override
	public void bake() {
		System.out.println("NewYork Pizza Paked.");
		
	}

	@Override
	public void topping() {
		System.out.println("NewYork Pizza add topping.");
		
	}

	@Override
	public void serve() {
		System.out.println("NewYork Pizza served.");
		
	}

	@Override
	public void payment() {
		System.out.println("NewYork Pizza payment.");
		
	}

}
