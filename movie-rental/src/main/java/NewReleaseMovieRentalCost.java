
public class NewReleaseMovieRentalCost implements IRentalCost{

	@Override
	public double totalRentalCost(int daysRented) {
		double sum = 0;
		if (daysRented <= 3) {
			sum += daysRented * 3;
		} else {
			sum += ((daysRented - 3) * 6) + 9;
		}
		return sum;
	}

}
