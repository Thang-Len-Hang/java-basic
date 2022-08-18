package TransDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TransDemo {

	public static void main(String[] args) {
		
		try(Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/dbtransaction",
						"root","root");
			
			Statement s1 = connection
					.createStatement()){
				
			ResultSet resultSet = s1.executeQuery("select * from cash_account where cash_account_id = 1");
			
			while(resultSet.next()) {
				String name = resultSet.getString("name");
				int amount = resultSet.getInt("amount");
				
				System.out.println(name+" : "+amount);
			}
			//System.out.println("Connceted");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
