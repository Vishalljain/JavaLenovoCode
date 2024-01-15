package com.telusko.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.telusko.Model.CP;
import com.telusko.Model.Student;

public class StudentDao {
	
	public static boolean insertStudenttoDb(Student student) {
		boolean f = false;
		try {
			
			Connection con = CP.createConnection();
			String sql = "insert into Student(sname,sphone,scity) values (?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,student.getStudentName());
			pstmt.setString(2,student.getStudentPhone());
			pstmt.setString(3,student.getStudentCity());
			pstmt.executeUpdate();
			f=true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public static boolean deleteStudenttoDb(int studentId) {
		boolean f = false;
		try {
			Connection con = CP.createConnection();
			String sql = "delete from Student where sid = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,studentId);
			pstmt.executeUpdate();
			f=true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	
	}

	public static void displayAllStudents() throws SQLException {
		Connection con = CP.createConnection();
		String sql = "select * from Student";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String phone = rs.getString(3);
			String city = rs.getString(4);
			System.out.println("ID : " +id);
			System.out.println("NAME : " +name);
			System.out.println("PHONE : " +phone);
			System.out.println("CITY : " +city);
			System.out.println("**************************************");
		}

		
	}

}
