import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCharactersInString {
	public static void main(String[] args) {
		String x="sillyspiders";
		char[] y=x.toCharArray();
		int size=y.length;
		int i=0;
		Map<Character,Integer> map=new HashMap<>();
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
			if(data.getValue()>1) {
				System.out.print(data.getKey());//Expected Output:s,l,i
				System.out.print("\t" +data.getValue());//3,2,2
				System.out.println(" ");
		
		}
		}
		
	}

}
