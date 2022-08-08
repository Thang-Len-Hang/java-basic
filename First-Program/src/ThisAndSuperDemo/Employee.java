package ThisAndSuperDemo;

public class Employee {
	private String name;
	private double salary;

	// 1. local to instance variable
	// 2. refer object
	// 3. can call constructor with different parameters (Over loading constructor)
	// 4. to call methods and variables within its class

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
