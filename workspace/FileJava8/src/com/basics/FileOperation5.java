package com.basics;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;

public class FileOperation5 {
public static void main(String[] args) throws IOException   {
		
		Path p1 = Paths.get("D:\\workspace\\FileJava8\\src\\\\com\\basics\\data1.txt");
		String s = "India is beautiful country!!!";
		Path write1 = Files.write(p1, s.getBytes(), StandardOpenOption.WRITE);
		//Files.write(path, bytes, options)
		System.out.println(write1.toUri().getPath());
		
		System.out.println("-------------------------");
		Path p2 = Paths.get("D:\\workspace\\FileJava8\\src\\com\\basics\\data2.txt");
		List<String> names = new LinkedList<>();
		names.add("KK");
		names.add("PK");
		names.add("PK");
		names.add("PK");
		names.add("KK");
		Path write2 = Files.write(p2, names, Charset.forName("UTF-8"), StandardOpenOption.WRITE);
		System.out.println(write2.toUri().getPath());///D:/workspace/FileJava8/src/com/basics/data1.txt
		
	}

}
