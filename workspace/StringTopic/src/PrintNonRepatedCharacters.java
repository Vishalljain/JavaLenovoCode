import java.util.HashMap;
import java.util.Map;

public class PrintNonRepatedCharacters {
	public static void main(String[] args) {
		String x = "sillyspider";
		char[] y = x.toCharArray();
		int size= y.length;
		
		int i =0;
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		while(i!=size) {
			if(map.containsKey(y[i])==false) {
				map.put(y[i], 1);
				
			}
			else {
				int oldvalue = map.get(y[i]);
				int newvalue= oldvalue+1;
				map.put(y[i], newvalue);
				
			}
			i++;
			
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer> hmap : map.entrySet()) {
			if(hmap.getValue()==1) {
				System.out.println(hmap.getKey());
			}
		}
	}
}