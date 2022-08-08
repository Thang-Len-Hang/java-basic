package DecoratorPattern;

public class Main {

	public static void main(String[] args) {

		ICoffee coffee = new ToppingDecorator(
				new CreamerDecorator(new MilkDecorator(new SugarDecorator(new PlaneCoffee()))));
		System.out.println(coffee.makeCoffee());
	}

}
