import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertIntoDatabase {
	public static void main(String[] args) throws SQLException {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			String URL = "jdbc:mysql://localhost:3307/Student";
			String userName = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(URL, userName, password);
			Statement stmt = con.createStatement();
			String sql="INSERT INTO Registration "+" values(101,'vishal','L',22)";
			stmt.executeUpdate(sql);
			sql="INSERT INTO Registration "+" values(102,'suhas','BS',23)";
			stmt.executeUpdate(sql);
			sql="INSERT INTO Registration "+" values(103,'Gurudat','Sanu',24)";
			stmt.executeUpdate(sql);
			System.out.println("Insered successfully");
			
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
