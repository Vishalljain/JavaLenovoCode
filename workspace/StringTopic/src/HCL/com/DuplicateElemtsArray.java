package HCL.com;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateElemtsArray {
	public static void main(String[] args) {
		int[] myarray= {6,1,8,2,5,6,8,2,1,100,6,9};
		Set<Integer> set = new LinkedHashSet<>();
		for(int i = 0 ; i<myarray.length;i++) {
			set.add(myarray[i]);
		}
		System.out.println(set );
	}
	

}
