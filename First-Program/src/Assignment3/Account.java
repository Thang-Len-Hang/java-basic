package Assignment3;

public class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	public Account(double balance, AccountType acctType, Employee employee) {
		super();
		this.balance = balance;
		this.acctType = acctType;
		this.employee = employee;
	}

	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}

	public Employee getEmployee() {
		return employee;
	}

	Account(Employee employee, AccountType acctType) {
		this(DEFAULT_BALANCE, acctType, employee);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if (balance > amount) {
			balance -= amount;
			return true;
		}
		return false;

	}

}
