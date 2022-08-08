package OnlineShopEgForAbstraction;

public class TV extends Electronics {
	private int size;

	public TV(String name, double price, String manufacture, int size) {
		super(name, price, manufacture);
		this.size = size;
	}

	@Override
	public double computeSalePrice() {

		return getPrice() - (getPrice() * 0.02);
	}
}
