// Before generics, we can store any type of objects in the collection, i.e., non-generic. Now generics force the java programmer to store a specific type of objects.
// Using Generic it is possible to create classes that work with different data types.
//Advantage:1.Type safety-We can hold single type of objects in generics.It doesnot store other objects.Example see below code
//2.Type casting
//3.Compile time checking:It is checked at compile rather than run time.so it is far better to handle in comile time
//than handling in run time 
package Generic1com;

import java.util.ArrayList;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		//before generics
		List l1 = new ArrayList();
		l1.add(1);
		l1.add("String");
		System.out.println(l1);
		//after Generics
		List<Integer> l2 = new ArrayList();
		l2.add(1);
	//	l2.add("String");thrw error
	}
	

}
