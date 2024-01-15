//2.There is no need to type caste the object if we used generics
package Generic1com;

import java.util.ArrayList;
import java.util.List;

public class Exampl2 {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("Hello");
		String s = (String) l.get(0);//Type casting
		System.out.println(s);
		List<String> l1 = new ArrayList();
		l1.add("Hellooo");
		String s1 = l1.get(0);
		System.out.println(s1);
	}

}
