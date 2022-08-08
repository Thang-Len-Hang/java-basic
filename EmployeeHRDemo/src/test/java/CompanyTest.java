
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class CompanyTest {

	@Test
	public void should_return_total_salary_for_company() {
		SalariedEmployee salariedEmployee1 = new SalariedEmployee(1, "Thomas", "Mann");
		SalariedEmployee salariedEmployee2 = new SalariedEmployee(2, "John", "William");
		SalariedEmployee salariedEmployee3 = new SalariedEmployee(3, "Richard", "Chen");

		salariedEmployee1.setSalary(1000);
		salariedEmployee2.setSalary(1500);
		salariedEmployee3.setSalary(1000);

		HourlyEmployee hourlyEmployee1 = new HourlyEmployee(4, "Thuza", "Nwe");
		HourlyEmployee hourlyEmployee2 = new HourlyEmployee(5, "Thu Thu", "Thaw");

		hourlyEmployee1.setWorkHours(30);
		hourlyEmployee1.setWorkingRate(200);

		hourlyEmployee2.setWorkHours(40);
		hourlyEmployee2.setWorkingRate(200);

		Company company = new Company();
		company.addEmployee(salariedEmployee1);
		company.addEmployee(salariedEmployee2);
		company.addEmployee(salariedEmployee3);
		company.addEmployee(hourlyEmployee1);
		company.addEmployee(hourlyEmployee2);

		assertThat(company.totalSalary(), equalTo(17500.0));

	}
}
