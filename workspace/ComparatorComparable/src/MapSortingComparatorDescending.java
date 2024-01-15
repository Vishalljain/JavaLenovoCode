import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class MyCom implements Comparator<Entry<String,Integer>>{

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		// TODO Auto-generated method stub
		return o1.getValue()-o2.getValue();
	}
	
}
public class MapSortingComparatorDescending {
	public static void main(String[] args) {
	Map<String,Integer> hmap = new HashMap();
	hmap.put("Vishal",5);
	hmap.put("Hello",100);
	hmap.put("Hi", 1);
	List<Entry<String,Integer>> list = new ArrayList(hmap.entrySet());
	Collections.sort(list,new MyCom().reversed());
	System.out.println(list);
	Entry<String,Integer> h1 = Collections.max(list,new MyCom());
	System.out.println("Max"+h1);
	}
	

}
