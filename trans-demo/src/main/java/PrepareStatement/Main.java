package PrepareStatement;

import java.sql.*;

public class Main {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtransaction", "root",
				"root");

				PreparedStatement findCashBalance = connection
						.prepareStatement("select * from cash_account where cash_account_id = ? ");
				PreparedStatement withdrawDepositeCash = connection
						.prepareStatement("update cash_account set amount =? where cash_account_id = ?")) {

			int transferAmount = 500;
			connection.setAutoCommit(false);
			withDraw(2, 500, withdrawDepositeCash, findCashBalance);
			deposit(1, transferAmount, withdrawDepositeCash, findCashBalance);
			connection.commit();

			System.out.println("Balance Mary:: " + findBalanceCashAccount(2, findCashBalance));
			System.out.println("Balance John:: " + findBalanceCashAccount(1, findCashBalance));

			/*
			 * while (resultSet.next()) { String name = resultSet.getString("name"); int
			 * amount = resultSet.getInt("amount");
			 * 
			 * System.out.println(name + " : "+ amount); }
			 */

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static int findBalanceCashAccount(int id, PreparedStatement preparedStatement) throws SQLException {
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		int amount = 0;
		while (resultSet.next()) {
			amount = resultSet.getInt("amount");
		}
		return amount;
	}

	public static int withDraw(int id, int amount, PreparedStatement withdraw, PreparedStatement findBalance)
			throws SQLException {

		int currentAmount = findBalanceCashAccount(id, findBalance);
		int withdrawAmount = 0;
		if (currentAmount < amount) {
			throw new RuntimeException(amount + " insuffcient amount!");
		} else {
			withdrawAmount = currentAmount - amount;
			withdraw.setInt(1, withdrawAmount);
			withdraw.setInt(2, id);
			withdraw.executeUpdate();
		}
		return withdrawAmount;
	}

	public static int deposit(int id, int amount, PreparedStatement deposite, PreparedStatement balance)
			throws SQLException {
		int currentAmount = findBalanceCashAccount(id, balance);
		int depositAmount = currentAmount + amount;
		deposite.setInt(1, depositAmount);
		deposite.setInt(2, id);
		deposite.executeUpdate();
		return depositAmount;

	}

}
