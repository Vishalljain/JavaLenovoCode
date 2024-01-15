import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTheInsertedRecords {
	public static void main(String[] args) throws SQLException {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			String URL = "jdbc:mysql://localhost:3307/Student";
			String userName = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(URL, userName, password);
			Statement stmt = con.createStatement();
			String sql="    ";
			 ResultSet rs = stmt.executeQuery(sql);
			 while(rs.next()) {
				 int id=rs.getInt(1);
				 String first=rs.getString(2);
				 String last=rs.getString(3);
				 int age=rs.getInt(4);
				 System.out.println(id+":"+first+":"+last+":"+age);
				 
			 }

		
		
		con.close();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
