import java.util.ArrayList;
import java.util.List;

public class Customer {

	private List<Rental> rentals = new ArrayList<>();

	private IRentalCost iRentalCost;

	public void setiRentalCost(IRentalCost iRentalCost) {
		this.iRentalCost = iRentalCost;
	}

	public double totalRentalCost() {

		double sum = 0;
		for (Rental rental : rentals) {

			sum += iRentalCost.totalRentalCost(rental.getDaysRented());
			System.out.println("hh");
		}
		return sum;
	}

	/*
	 * public double totalRentalCost() {
	 * 
	 * double sum = 0;
	 * 
	 * for (Rental rental : rentals) { switch (rental.getMovie().getMovieType()) {
	 * case CHTLDREN_MOVIE: if (rental.getDaysRented() <= 7) { sum +=
	 * rental.getDaysRented() * 1; } else { sum += ((rental.getDaysRented() - 7) *
	 * 2) + 7; } break; case REGULAR_MOVIE: if (rental.getDaysRented() <= 5) { sum
	 * += rental.getDaysRented() * 2; } else { sum += ((rental.getDaysRented() - 5)
	 * * 3) + 10; } break; case NEW_RELEASE_MOVIE: if (rental.getDaysRented() <= 3)
	 * { sum += rental.getDaysRented() * 3; } else { sum += ((rental.getDaysRented()
	 * - 3) * 6) + 9; } } } return sum; }
	 */

	public void addRental(Rental rental) {
		rentals.add(rental);
	}
}
