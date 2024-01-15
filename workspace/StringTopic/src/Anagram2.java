import java.util.Arrays;

public class Anagram2 {
	public static void main(String[] args) {
		String x="He is a AradHya";
		String y="Is he a HradAya";
		x=x.replace(" ", "");
		//System.out.println(x);
		y=y.replace(" ", "");
		x=x.toUpperCase();
		y=y.toUpperCase();
		char[] a = x.toCharArray();
		char[] b = y.toCharArray();
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		Boolean results=Arrays.equals(a, b);
		if (results==true) {
			System.out.println("Anagrams");
			
		}
		else {
			System.out.println("Not anagrams");
		}
				
	}


}
