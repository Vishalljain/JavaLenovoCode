import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {
	public static void main(String[] args) {
		
	
	List<String> names = new ArrayList<String>();
    
	names.add("LOK");  
	names.add("JAVACRAZY");  
	names.add("LOKESHGUPTAINDIA"); 
	names.add("LOKESH123");  
	 
	String regex = "^[A-Z]{1,3}$";
	 
	Pattern pattern = Pattern.compile(regex);
	 
	for (String name : names)
	{
	    Matcher matcher = pattern.matcher(name);
	    System.out.println(matcher.matches());
	}
	
	

}
}
