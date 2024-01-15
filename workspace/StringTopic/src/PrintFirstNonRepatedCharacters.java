import java.util.LinkedHashMap;
import java.util.Map;

public class PrintFirstNonRepatedCharacters {
	public static void main(String[] args) {
		String x = "sillyspiders";
		char[] y = x.toCharArray();
		int size = y.length;
		int i =0;
		Map<Character,Integer> map = new LinkedHashMap();
		while(i!=size) {
			if(map.containsKey(y[i])==false) {
				map.put(y[i],1);
				
			}
			else {
				int oldvalue = map.get(y[i]);
				int newvalue = oldvalue+1;
				map.put(y[i], newvalue);
			}
			i++;
		}
		for(Map.Entry<Character, Integer> data: map.entrySet()) {
			if(data.getValue()==1) {
				System.out.println(data.getKey());
				System.exit(0);
				
			}
		}
			
			
		
		
		
	}

}

