
public class ChildrenMovieRentalCost implements IRentalCost {

	@Override
	public double totalRentalCost(int daysRented) {

		double sum = 0;
		if (daysRented <= 7) {
			sum += daysRented * 1;
		} else {
			sum += ((daysRented - 7) * 2) + 7;
		}
		return sum;
	}

}
