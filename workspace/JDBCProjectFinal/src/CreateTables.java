import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTables {
	public static void main(String[] args) throws SQLException {
			try {
		Class.forName("com.mysql.jdbc.Driver");
		String URL="jdbc:mysql://localhost:3307/Student";
		String userName="root";
		String password="root";
		Connection con=DriverManager.getConnection(URL,userName,password);
		
		String sql="CREATE TABLE REGISTRATION " +
                "(id INTEGER not NULL, " +
                " first VARCHAR(255), " + 
                " last VARCHAR(255), " + 
                " age INTEGER, " + 
                " PRIMARY KEY ( id ))"; 

		Statement stmt = con.createStatement();
		stmt.executeUpdate(sql);
		System.out.println("Created");
		
		
		con.close();
			}catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
			}
			
			
			}
}

