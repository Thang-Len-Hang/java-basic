package Assignment3;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	private AccountType accountType;
	private static int chooser;
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Kyaw", "Kyaw Yee", 500000,LocalDate.of(2022, 4, 22));
		Account accCheck = new Account(300, AccountType.CHECKING, employee);
		Account accSave = new Account(300, AccountType.SAVING, employee);
		Account accRetire = new Account(300, AccountType.RETIREMENT, employee);
		
		showGreet();
		askAccount();
		accCheck = new Account(300, getType(chooser), employee);
		System.out.println(accCheck.getAcctType());
		accCheck.makeDeposit(200);
		System.out.println(accCheck.getBalance());
		accCheck.makeWithdrawal(100);
		System.out.println(accCheck.getBalance());
		
	}
	
	public static void showGreet() {
		System.out.println("==========================================================");
		System.out.println("====================Employee Account======================");
		System.out.println("==========================================================");
	}
	
	public static void askAccount() {
		System.out.println("====================Choose Account Type======================");
		System.out.println("""
				1.CHECKING
				2.SAVING
				3.RETIREMENT
				""");
		chooser = sc.nextInt();
	}
	
	static AccountType getType(int i) {
		switch(i) {
		case 1: return AccountType.CHECKING;
		case 2: return AccountType.SAVING;
		default: return AccountType.RETIREMENT;
		}
	}
}
