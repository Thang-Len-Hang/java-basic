
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HourlyEmployeeTest {

	HourlyEmployee hourlyEmployee;

	@BeforeEach
	public void init() {
		hourlyEmployee = new HourlyEmployee(1, "John", "Doe");
	}

	@Test
	public void should_return_salary_for_hourly_employee() {

		hourlyEmployee.setWorkHours(20);
		hourlyEmployee.setWorkingRate(200);
		assertThat(hourlyEmployee.calculateSalary(), equalTo(4000.0));
	}

	@Test
	public void should_return_15_for_charity() {
		assertThat(hourlyEmployee.charity(15), equalTo(15.0));
	}

	@Test
	public void should_throw_IllegalArgumentException_when_amount_is_less_than_10() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> hourlyEmployee.charity(8));
	}
	
	@Test
	public void should_return_70000_for_life_insurance() {
		hourlyEmployee.setiLifeInsurance(new HourlyEmployeeLifeInsurance());
		assertThat(hourlyEmployee.makeLifeInsurance(), equalTo(70000.0));
	}
}
