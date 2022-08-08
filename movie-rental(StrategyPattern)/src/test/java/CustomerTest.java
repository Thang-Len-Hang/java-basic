
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class CustomerTest {

	private Customer customer;

	@BeforeEach
	public void init() {
		customer = new Customer();

	}

	@Test
	public void should_return_7_for_7_days_in_children_movie() {
		Rental rental1 = new Rental(new Movie("Bat Man", MovieType.CHTLDREN_MOVIE), 7);
		Rental rental2 = new Rental(new Movie("Wonder Woman", MovieType.CHTLDREN_MOVIE), 3);

		customer.addRental(rental1);
		customer.addRental(rental2);
		customer.setiRentalCost(new ChildrenMovieRentalCost());

		assertThat(customer.totalRentalCost(), equalTo(10.0));
	}

	@Test
	public void should_return_11_for_7_days_in_children_movie() {

		Rental rental1 = new Rental(new Movie("Dark Night", MovieType.CHTLDREN_MOVIE), 9);
		customer.addRental(rental1);
		customer.setiRentalCost(new ChildrenMovieRentalCost());
		assertThat(customer.totalRentalCost(), equalTo(11.0));
	}

	@Test
	public void should_return_6_for_3_days_in_regular_movie() {

		Rental rental1 = new Rental(new Movie("Moon Night", MovieType.REGULAR_MOVIE), 3);
		customer.addRental(rental1);
		customer.setiRentalCost(new RegularMovieRentalCost());
		assertThat(customer.totalRentalCost(), equalTo(6.0));

	}

	@Test
	public void should_return_13_for_6_days_in_regular_movie() {

		Rental rental1 = new Rental(new Movie("Kangro", MovieType.REGULAR_MOVIE), 6);
		customer.addRental(rental1);
		customer.setiRentalCost(new RegularMovieRentalCost());
		assertThat(customer.totalRentalCost(), equalTo(13.0));
	}

	@Test
	public void should_return_6_for_2_days_in_new_release_movie() {

		Rental rental1 = new Rental(new Movie("King Return", MovieType.NEW_RELEASE_MOVIE), 2);
		customer.addRental(rental1);
		customer.setiRentalCost(new NewReleaseMovieRentalCost());
		assertThat(customer.totalRentalCost(), equalTo(6.0));

	}

	@Test
	public void should_return_15_for_4_days_in_new_release_movie() {

		Rental rental1 = new Rental(new Movie("Avator", MovieType.NEW_RELEASE_MOVIE), 4);
		customer.addRental(rental1);
		customer.setiRentalCost(new NewReleaseMovieRentalCost());
		assertThat(customer.totalRentalCost(), equalTo(15.0));

	}
}
