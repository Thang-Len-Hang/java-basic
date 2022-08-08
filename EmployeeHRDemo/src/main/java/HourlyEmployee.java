
public class HourlyEmployee extends Employee {

	private double workHours;
	private double workingRate;

	public HourlyEmployee(int employeeId, String firstName, String lastName) {
		super(employeeId, firstName, lastName);
	}

	public double getWorkHours() {
		return workHours;
	}

	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}

	public double getWorkingRate() {
		return workingRate;
	}

	public void setWorkingRate(double workingRate) {
		this.workingRate = workingRate;
	}

	public double calculateSalary() {
		return workHours * workingRate;
	}
}
