import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//Listiterator supports bidirectional traversal ie both forward and backward direction
public class ListIterator1 {
	public static void main(String[] args) {
		ListIterator<String> litr = null;
		List<String> l1 = new ArrayList();
		l1.add("Apple");
		l1.add("Mango");
		l1.add("Grapes");
		l1.add("WaterMelon");
		l1.add("Jackfruit");
		
		litr =l1.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("------------------");
		//Backwrd direction
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}

}
