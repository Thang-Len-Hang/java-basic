package OnlineShopEgForAbstraction;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Product[] products = new Product[5];
		products[0] = new TV("Samsung", 2500, "Samsung", 55);
		products[1] = new TV("SonyTV", 3000, "Sony", 60);
		products[2] = new EbookReader("Kindle", 300, "Amazon", "Grey");
		products[3] = new Book("First Java", 50, LocalDate.of(2000, 3, 12), "Sun");
		products[4] = new Book("A pale view of Hill", 60, LocalDate.of(2005, 3, 10), "Japan");

		double totalRegularPrice = 0;
		double totalSalesPrice = 0;
		for (int i = 0; i < products.length; i++) {
			totalRegularPrice += products[i].getPrice();
			totalSalesPrice += products[i].computeSalePrice();
			System.out.println("Item " + products[i].getClass().getSimpleName() + " RegularPrice "
					+ products[i].getPrice() + " : "+"SalePrice: "+products[i].computeSalePrice());
		}

		System.out.println("Total Regular Price: " + totalRegularPrice);
		System.out.println("Total Sales Price: " + totalSalesPrice);
	}

}
