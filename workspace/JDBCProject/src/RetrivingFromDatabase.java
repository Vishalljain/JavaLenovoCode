import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrivingFromDatabase {
public static void main(String[] args) throws SQLException {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String URL="jdbc:mysql://localhost:3307/vishal";
		String userName="root";
		String password="root";
		Connection con=DriverManager.getConnection(URL,userName,password);
		String query="select *from table1";
		Statement stm=con.createStatement();
		ResultSet set=stm.executeQuery(query);
		while(set.next()) {
			int id=set.getInt(1);
			String name=set.getString(2);
			String city=set.getString(3);
			System.out.println(id+":"+name+":"+city);
			
		}
			con.close();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
}
}

