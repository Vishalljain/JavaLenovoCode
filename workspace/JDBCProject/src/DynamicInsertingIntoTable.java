import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DynamicInsertingIntoTable {
	public static void main(String[] args) throws SQLException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String URL="jdbc:mysql://localhost:3307/vishal";
			String userName="root";
			String password="root";
			Connection con=DriverManager.getConnection(URL,userName,password);
			String q="insert into table1(tname,tcity) values(?,?)";
			PreparedStatement pst=con.prepareStatement(q);
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));//BufferedReader is a Java class that reads text from the input stream.
			System.out.println("Enter name");
			String name=br.readLine();
			System.out.println("Enter Cities");
			String city=br.readLine();
			pst.setString(1, name);
			pst.setString(2, city);
			pst.executeUpdate();
			System.out.println("Inserted");
			
		}	catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	

}
}
