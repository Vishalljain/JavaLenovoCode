import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		String x="sillyspiders";
		char[] y=x.toCharArray();
		int size=y.length;
		int i=0;
		String res=" ";
		Map<Character,Integer> map=new LinkedHashMap<>();
		while(i!=size) {
			if(map.containsKey(y[i])==false) {
				map.put(y[i], 1);
			}
			else {
				int oldValue=map.get(y[i]);
				int newValue=oldValue+1;
				map.put(y[i], newValue);
				
			}
			i++;
		}
		//System.out.println(map);
		for (Map.Entry<Character, Integer> data : map.entrySet()) {
			res=res+data.getKey();//res=" "+s=>res=s--->res=s+i;=>res=si
			//res=s+i;=>res=si
			
	}
		System.out.println(res);

}
}
