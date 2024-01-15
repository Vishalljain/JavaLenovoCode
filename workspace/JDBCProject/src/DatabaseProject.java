import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseProject {
	public static void main(String[] args) {
		DatabaseProject pro=new DatabaseProject();
		pro.createConnection();
		
	}
	void createConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");//Load the driver
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mydb","root","root");//establish the connection
			System.out.println("Connection established");
			Statement stm=con.createStatement();//create the connection object
			ResultSet rs=stm.executeQuery("select *from mydb.users");//execute a query
			while(rs.next()) {//process the results.
				String name=rs.getNString("name");
				System.out.println(name);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
