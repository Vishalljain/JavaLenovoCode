package com.basics;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
//demo on files.find
public class FileOperation3 {
	public static void main(String[] args) {

		Path p = Paths.get("C:\\Users\\Vishal\\Desktop\\amdocs");
		try {
	   Files.find(p, 2,(path, BasicFileAttributes) -> String.valueOf(path).endsWith(".txt")).map(path -> path.getFileName()).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
