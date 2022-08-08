package TemplateMethodPattern;

public abstract class TemplatePizza {

	public final void orderPizza() {
		prepare();
		bake();
		topping();
		serve();
		payment();
	}

	public abstract void prepare();

	public abstract void bake();

	public abstract void topping();

	public abstract void serve();

	public abstract void payment();

}
