import java.util.HashMap;
import java.util.Map;

public class MapSotingWithStreams {
	public static void main(String[] args) {
		Map<String,Integer> hmap = new HashMap();
		hmap.put("Vishal",50000);
		hmap.put("Hello",100);
		hmap.put("Hi", 1);
		hmap.put("Sagar",5000);
		hmap.put("Hey",5086);
		hmap.put("Ji", 1000);
		hmap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("------------");
		hmap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		//hmap.entrySet().stream().sorted(Map.Entry.comparingByValue()).c;
		
	}

}
