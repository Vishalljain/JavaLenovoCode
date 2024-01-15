//The idea is to allow type (Integer, String, … etc and user defined types) to be a parameter to methods, classes and interfaces

// Before generics, we can store any type of objects in the collection, i.e., non-generic. Now generics force the java programmer to store a specific type of objects.
package Generic1.com;

public class GenericRunner {
	public static void main(String[] args) {
		MyCustomList<String> list1=new MyCustomList();
		list1.addElemet("element 1");
		list1.addElemet("element 2");
		System.out.println(list1);
	String a=list1.get(0);
		System.out.println(" got "+a);
		
		
		
		
		MyCustomList<Integer> list2=new MyCustomList();
		list2.addElemet(Integer.valueOf(0));
		list2.addElemet(Integer.valueOf(4));
		System.out.println(list2);
//		Integer b=list2.get(1);
//		System.out.println(" got "+b);
	}


}
