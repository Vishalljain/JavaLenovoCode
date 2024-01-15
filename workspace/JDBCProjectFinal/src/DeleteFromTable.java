import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteFromTable {
	public static void main(String[] args) throws SQLException {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			String URL = "jdbc:mysql://localhost:3307/Student";
			String userName = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(URL, userName, password);
			Statement stmt = con.createStatement();
			String sql="delete from Registration where id=102";
			stmt.executeUpdate(sql);
			System.out.println("Deleted Id successfully");
				 con.close();
			 
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
	}





