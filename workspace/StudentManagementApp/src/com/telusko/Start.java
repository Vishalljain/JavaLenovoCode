package com.telusko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.telusko.Model.Student;
import com.telusko.dao.StudentDao;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException, SQLException {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Student Management app");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Press 1 to add Student");
			System.out.println("Press 2 to delete Student");
			System.out.println("Press 3 to display Student");
			System.out.println("Press 4 to exit");
			int c = Integer.parseInt(br.readLine());
			if (c == 1) {
				System.out.println("Enter the student name : ");
				String name = br.readLine();
				System.out.println("Enter the student phone : ");
				String phone = br.readLine();
				System.out.println("Enter the student city : ");
				String city = br.readLine();
				Student student = new Student(name, phone, city);
				boolean insertStudenttoDb = StudentDao.insertStudenttoDb(student);
				if (insertStudenttoDb) {
					System.out.println("Student added Successfully");
				} else {
					System.out.println("Student Not added...Something went wrong");
				}
				System.out.println(student);
			} else if (c == 2) {
				System.out.println("Enter student id to delete ");
				int studentId=Integer.parseInt(br.readLine());
				boolean deleteStudenttoDb = StudentDao.deleteStudenttoDb(studentId);
				if (deleteStudenttoDb) {
					System.out.println("Student deleted Successfully");
				} else {
					System.out.println("Student Not Deleted...Something went wrong");
				}

			} else if (c == 3) {
				//display students
				StudentDao.displayAllStudents();

			} else if (c == 4) {
				break;

			} 

		}

		System.out.println("ThankYou for using my application");
		System.out.println("See you soon Bye");

	}

}
