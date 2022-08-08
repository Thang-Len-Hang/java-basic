package DecoratorPattern;

public class ToppingDecorator extends CoffeeDecoratorAbstraction {

	public ToppingDecorator(ICoffee iCoffee) {
		super(iCoffee);
	
	}

	@Override
	public String makeCoffee() {
		return iCoffee.makeCoffee()+" Topping";
	}

}
