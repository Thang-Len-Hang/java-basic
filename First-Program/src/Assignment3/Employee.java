package Assignment3;

import java.sql.Date;
import java.time.LocalDate;

public class Employee {

	// instance fields
	private String name;
	private String nickName;
	private double salary;
	private LocalDate hireDay;

	public Employee(String name, String nickName, double salary, LocalDate hireDay) {
		super();
		this.name = name;
		this.nickName = nickName;
		this.salary = salary;
		this.hireDay = hireDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void setHireDay(LocalDate hireDay) {
		this.hireDay = hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	

	private String format = "name = %s, salary = %.2f, hireDay = %s";

	@Override
	public String toString() {
		return "Employee [name=" + name + ", nickName=" + nickName + ", salary=" + salary + ", hireDay=" + hireDay
				+ "]";
	}

}
