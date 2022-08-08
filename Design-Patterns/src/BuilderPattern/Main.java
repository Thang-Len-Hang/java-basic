package BuilderPattern;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Product product = new Product("P001", "Apple", "2000", "Good Taste", LocalDate.now(), 20);
	
		Product product1 = new ProductBuilder()
				.create()
				.addName("Orange")
				.addDescription("Nice")
				.addProductId("P001")
				.addLastUpdate(LocalDate.now())
				.addPrice("2000")
				.addQuantity(100)
				.build();
		System.out.println(product1);
	}
}
