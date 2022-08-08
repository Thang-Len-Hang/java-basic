package ThisAndSuperDemo;

public class Manager extends Employee {

	private double bonus;

	public Manager(String name, double salary) {
		super(name, salary); // call parent class's constructor// only in top
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getSalary() {
		return super.getSalary() + bonus;
	}

	public static void main(String[] args) {
		/*
		 * Manager m1 = new Manager("John", 1000); m1.setBonus(500);
		 * System.out.println("Salary: " + m1.getSalary());
		 */

		Employee e1 = new Employee("John", 2000);
	}
}
