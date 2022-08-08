
public class SugarDecorator extends CoffeeDecoratorAbstraction {

	public SugarDecorator(ICoffee iCoffee) {
		super(iCoffee);
	
	}

	@Override
	public String makeCoffee() {
		return iCoffee.makeCoffee()+" Sugar";
	}

}
