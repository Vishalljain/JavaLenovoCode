package com.telusko.Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection con;
	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3307/jdbcDemo";
			String user="root";
			String password="root";
			con = DriverManager.getConnection(url,user,password);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
