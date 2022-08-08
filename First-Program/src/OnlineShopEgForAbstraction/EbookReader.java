package OnlineShopEgForAbstraction;

public class EbookReader extends Electronics {
	private String color;

	public EbookReader(String name, double price, String manufacture, String color) {
		super(name, price, manufacture);
		this.color = color;
	}

	public double computeSalePrice() {
		return getPrice() - (getPrice() * 0.03);
	}

}
