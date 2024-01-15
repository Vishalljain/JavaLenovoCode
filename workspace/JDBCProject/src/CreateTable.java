import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String URL="jdbc:mysql://localhost:3307/vishal";
			String userName="root";
			String password="root";
			Connection con=DriverManager.getConnection(URL,userName,password);
			String q="create table table1(tId int(20) primary key auto_increment,tname varchar(21) not null,tcity varchar(20))";
			Statement stm=con.createStatement();
			stm.executeUpdate(q);
			System.out.println("Table created in Database");
			con.close();
		}	catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
	}

}
