package com.basics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
//demo on files.list
public class FileOperation1 {
	public static void main(String[] args) {
		Stream<Path> list = null;
		try {
			list = Files.list(Paths.get("."));
			list.forEach(System.out::println);
			System.out.println("------------------------");
			Files.list(Paths.get("C:\\Users\\Vishal\\Desktop\\amdocs")).filter(Files::isRegularFile).forEach(System.out::println);
			//Files.list(Paths.get("C:\\apache-tomcat-7.0.47")).filter(Files::isRegularFile).forEach(System.out::println);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(list!=null) {
				list.close();
			}
			
		}
	}

}//cntrl shift t to serach class
//cntrl o to search function
