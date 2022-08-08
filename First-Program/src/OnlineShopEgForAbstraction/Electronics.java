package OnlineShopEgForAbstraction;

public abstract class Electronics extends Product {

	private String manufacture;

	public Electronics(String name, double price, String manufacture) {
		super(name, price);
		this.manufacture = manufacture;
	}
}
