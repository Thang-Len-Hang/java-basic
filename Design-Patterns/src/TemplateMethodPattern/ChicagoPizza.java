package TemplateMethodPattern;

public class ChicagoPizza extends TemplatePizza{

	@Override
	public void prepare() {
		System.out.println("Chicago Pizza Prepared.");
		
	}

	@Override
	public void bake() {
		System.out.println("Chicago Pizza Paked.");
		
	}

	@Override
	public void topping() {
		System.out.println("Chicago Pizza add topping.");
		
	}

	@Override
	public void serve() {
		System.out.println("Chicago Pizza served.");
		
	}

	@Override
	public void payment() {
		System.out.println("Chicago Pizza make payment.");
		
	}

}
