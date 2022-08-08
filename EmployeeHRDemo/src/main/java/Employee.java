
public abstract class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	
	private ILifeInsurance iLifeInsurance;
	

	public void setiLifeInsurance(ILifeInsurance iLifeInsurance) {
		this.iLifeInsurance = iLifeInsurance;
	}
	
	public double makeLifeInsurance() {
		return iLifeInsurance.makeLifeInsurance();
	}

	public Employee(int employeeId, String firstName, String lastName) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public abstract double calculateSalary();

	public double charity(int amount) {

		if (amount < 10) {
			throw new IllegalArgumentException();
		}

		return amount;
	}
	
	
}
