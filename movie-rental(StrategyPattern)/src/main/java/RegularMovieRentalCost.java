
public class RegularMovieRentalCost implements IRentalCost{

	@Override
	public double totalRentalCost(int daysRented) {
		double sum = 0;
		if (daysRented <= 5) {
			sum += daysRented * 2;
		} else {
			sum += ((daysRented - 5) * 3) + 10;
		}
		return sum;
	}

}
