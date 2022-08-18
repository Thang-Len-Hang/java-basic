package TransDemo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TransDemo {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtransaction", "root",
				"root");

				PreparedStatement s1 = connection
						.prepareStatement("select * from cash_account where cash_account_id = ?")) {

			s1.setInt(1, 1);
			
			ResultSet resultSet = s1.executeQuery();

			while (resultSet.next()) {
				String name = resultSet.getString("name");
				int amount = resultSet.getInt("amount");

				System.out.println(name + " : " + amount);
			}
			// System.out.println("Connceted");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
