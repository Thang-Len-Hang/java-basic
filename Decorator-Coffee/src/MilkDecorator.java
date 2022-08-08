
public class MilkDecorator extends CoffeeDecoratorAbstraction {

	public MilkDecorator(ICoffee iCoffee) {
		super(iCoffee);
	
	}

	@Override
	public String makeCoffee() {
		return iCoffee.makeCoffee()+" Milk";
	}

}
