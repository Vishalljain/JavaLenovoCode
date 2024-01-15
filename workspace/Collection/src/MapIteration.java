import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapIteration {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap();
		map.put("1", "hello");
		map.put("10", "hello1");
		map.put("50", "hello5");
		map.put("10","h");
		map.remove("10");
	for(Map.Entry<String, String> hm : map.entrySet()) {
		System.out.println(hm.getKey()+" "+hm.getValue());
		
	}
		}
		
		
	}


