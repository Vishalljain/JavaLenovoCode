import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetIteration {
public static void main(String[] args) {
	Set<String> set1 = new TreeSet<String>();
	set1.add("Vishal");
	set1.add("Vishal");
	set1.add("Akash");
	set1.add("Hello");;
	
	 for(String data:set1) { System.out.println(data); }
	 
	Iterator<String> ir = set1.iterator();
	while(ir.hasNext()) {
		System.out.println(ir.next());
	}
		
}
}
