import java.io.*;
import java.util.*;

public class I1 {

	public static void main(String[] args) 
	    { 
	        ArrayList<String> list = new ArrayList<String>(); 
	  
	        list.add("A"); 
	        list.add("B"); 
	        list.add("C"); 
	        list.add("D"); 
	        list.add("E"); 
	        
	        Iterator<String> it=list.iterator();
	        while(it.hasNext()) {
	        	System.out.println(it.next());
	        }
	    }
	
}
