import java.util.HashMap;
import java.util.Map;

public class MapEquals {
	public static void main(String[] args) {
	Map<Integer,String> map = new HashMap<>();
	
	map.put(1, "C");
	map.put(null,"A");
	map.put(null,"C");
	//map.put(0,null);
	System.out.println(map);
	
	
	}

}
