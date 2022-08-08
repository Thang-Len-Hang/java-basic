
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class SalariedEmployeeTest {

	SalariedEmployee salariedEmployee;

	@BeforeEach
	public void init() {
		salariedEmployee = new SalariedEmployee(1, "Hohn", "William");
	}

	@Test
	public void should_return_salary_for_salaried_employee() {

		salariedEmployee.setSalary(5000);
		assertThat(salariedEmployee.calculateSalary(), equalTo(5000.0));
	}

	@Test
	public void should_return_18_for_charity() {
		assertThat(salariedEmployee.charity(18), equalTo(18.0));
	}

	@Test
	public void should_throw_IllegalArgumentException_when_amount_is_less_than_ten() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> salariedEmployee.charity(2));
	}

	@Test
	public void should_return_amount_when_pension_for_Retire() {
		salariedEmployee.setPensionManager(new PensionManager());
		assertThat(salariedEmployee.makePension(180), equalTo(180.0));
	}

	@Test
	public void should_return_200_when_amount_is_more_than_200() {
		salariedEmployee.setPensionManager(new PensionManager());
		assertThat(salariedEmployee.makePension(250), equalTo(200.0));
	}

	@Test
	public void should_return_70000_for_life_insurance() {
		salariedEmployee.setiLifeInsurance(new SalariedEmployeeLifeInsurance());
		assertThat(salariedEmployee.makeLifeInsurance(), equalTo(100000.0));
	}

}
