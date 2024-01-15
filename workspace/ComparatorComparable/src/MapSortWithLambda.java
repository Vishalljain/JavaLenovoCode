import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSortWithLambda {
	public static void main(String[] args) {
		Map<String,Integer> hmap = new HashMap();
		hmap.put("Vishal",5000000);
		hmap.put("Hello",100);
		hmap.put("Hi", 1);
		hmap.put("Sagar",5000);
		hmap.put("Hey",5086);
		hmap.put("Ji", 100);
		List<Entry<String,Integer>> list = new ArrayList(hmap.entrySet());
		Collections.sort(list,(o1,o2)->o1.getValue()-o2.getValue());
		System.out.println("MinVal"+list);
		Collections.sort(list,(o1,o2)->o2.getValue()-o1.getValue());
		System.out.println("MaxVal"+list);
		Collections.sort(list,(o1,o2)->o1.getKey().compareTo(o2.getKey()));
		System.out.println("MinKey"+list);
		Collections.sort(list,(o1,o2)->o2.getKey().compareTo(o1.getKey()));
		System.out.println("MaxKey"+list);
		

}
}