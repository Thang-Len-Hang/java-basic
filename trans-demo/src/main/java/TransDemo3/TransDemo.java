package TransDemo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransDemo {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtransaction", "root",
				"root");

				PreparedStatement findCashBalance = connection.prepareStatement("select * from cash_account where cash_account_id = ?")) {

			System.out.println("Balance John: " + findBalanceCashAccount(1, findCashBalance));

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

}
