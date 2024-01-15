import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class B {
	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		list1.add("Vishal");
		list1.add("suhas");
		list1.add("Anmol");
		list1.add("Naveen");
		list1.add("Charan");
		list1.add("suhas");
		
		
		Set<String> list2=new HashSet<String>(list1);
		System.out.println(list2);
		
		

}
}
