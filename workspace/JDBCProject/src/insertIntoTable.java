import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class insertIntoTable {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String URL="jdbc:mysql://localhost:3307/vishal";
			String userName="root";
			String password="root";
			Connection con=DriverManager.getConnection(URL,userName,password);
			String q="insert into table1(tname,tcity) values(?,?)";
			PreparedStatement pst=con.prepareStatement(q);
			pst.setString(1, "Vishal");
			pst.setString(2, "Bhadravathi");
			pst.setString(1, "suhas");
			pst.setString(2, "Kolar ");
			pst.executeUpdate();
			System.out.println("Inserted successfully");
			con.close();
		}	catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
	}
}
