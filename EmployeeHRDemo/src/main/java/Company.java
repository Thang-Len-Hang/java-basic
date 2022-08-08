
public class Company {

	private Employee[] employees;

	private int count;

	public Company() {
		employees = new Employee[10];
	}

	public void addEmployee(Employee employee) {
		if (count == employees.length) {
			Employee[] newEmployees = new Employee[employees.length * 2];
			for (int i = 0; i < employees.length; i++) {
				newEmployees[i] = employees[i];
			}
			employees = newEmployees;
		}
		employees[count++] = employee;
	}

	public double totalSalary() {
		double sum = 0;
		for(int i = 0; i < count; i++) {
			sum += employees[i].calculateSalary();
		}
		return sum;
	}
}
