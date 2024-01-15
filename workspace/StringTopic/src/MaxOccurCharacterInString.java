import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MaxOccurCharacterInString {
	public static void main(String[] args) {
		String x = "PPLEA";
		char[] y = x.toCharArray();
		int size = y.length;
		int i = 0;
		Map<Character, Integer> map = new LinkedHashMap();
		while (i != size) {
			if (map.containsKey(y[i]) == false) {
				map.put(y[i], 1);

			} else {
				int oldValue = map.get(y[i]);
				int newValue = oldValue + 1;
				map.put(y[i], newValue);

			}
			i++;
		}
		System.out.println("The elements in key value pairs in map are:" +map);//{A=4, S=2, F=2, H=1, K=1, L=1, M=1, N=3, _=2, O=1}
		int maxVal=0;
		char maxKey=' ';
		for (Map.Entry<Character, Integer> data : map.entrySet()) {
			if(data.getValue()>maxVal) {
				maxVal=data.getValue();
				maxKey=data.getKey();
			}
			
			
		}
		
		int minVal=Integer.MAX_VALUE;
		char minKey=' ';
		for (Map.Entry<Character, Integer> data : map.entrySet()) {
			if(data.getValue()<minVal) {
				minVal=data.getValue();
				minKey=data.getKey();
			}
			
			
		}
		System.out.println("The max value is : " +maxVal);
		System.out.println("The max Character occured is : "+maxKey);
		System.out.println("The min value is : " +minVal);
		System.out.println("The min Character occured is : "+minKey);
		}
		

	}

