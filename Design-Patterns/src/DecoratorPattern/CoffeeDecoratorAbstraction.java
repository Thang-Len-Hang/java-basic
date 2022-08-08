package DecoratorPattern;

public abstract class CoffeeDecoratorAbstraction implements ICoffee {

		protected ICoffee iCoffee;

		public CoffeeDecoratorAbstraction(ICoffee iCoffee) {
			super();
			this.iCoffee = iCoffee;
		}
		
		
}
