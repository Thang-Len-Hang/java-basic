
public class CreamerDecorator extends CoffeeDecoratorAbstraction {

	public CreamerDecorator(ICoffee iCoffee) {
		super(iCoffee);
	
	}

	@Override
	public String makeCoffee() {
		return iCoffee.makeCoffee()+" Creamer";
	}

}
