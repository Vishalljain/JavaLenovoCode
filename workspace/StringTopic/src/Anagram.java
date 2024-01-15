import java.util.Arrays;

//An anagram is a phrase or word formed by rearranging the letters of a different word or a phase
//Ex are silent,Listen
//Brainy n binary
//Stort data in the strings//then compare
public class Anagram {
	public static void main(String[] args) {
		String x="silent";
		String y="listen";
		char[] a = x.toCharArray();
		char[] b = y.toCharArray();
		Arrays.parallelSort(a);
		System.out.println(a);
		Arrays.parallelSort(b);
		System.out.println(b);
		Boolean results=Arrays.equals(a, b);
		if (results==true) {
			System.out.println("Anagrams");
			
		}
		else {
			System.out.println("Not anagrams");
		}
				
	}

}
