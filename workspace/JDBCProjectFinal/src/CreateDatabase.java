import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String URL = "jdbc:mysql://localhost:3307/";
			String userName = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(URL, userName, password);
			Statement stmt = con.createStatement();
			String sql = "CREATE DATABASE Student";	
			stmt.executeUpdate(sql);
			System.out.println("Created Successfully");
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
