package com.basics;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class FileOperation2 {
	//demo on files.lines
public static void main(String[] args)  {
		
		Path path = Paths.get("D:\\workspace\\FileJava8\\src\\com\\basics\\data.txt");
		
		//try(Stream<String> lines = Files.lines(path).onClose(System.out.println("File closed") 
		//above line error as Onclose is not consumer so we can put direct sysout it is runnable which contains one method
				
		try(Stream<String> lines = Files.lines(path).onClose(()->System.out.println("File closed")))		{
		Optional<String> optional = lines.filter(s->s.contains("line15")).findFirst();
		if(optional.isPresent()){
			System.out.println(optional.get());
		}else
			System.out.println("No data found");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
