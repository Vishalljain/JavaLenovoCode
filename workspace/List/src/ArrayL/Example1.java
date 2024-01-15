  package ArrayL;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {
	public static void main(String[] args) {
		int[] arr=new int[3];//static array
		 
		ArrayList al=new ArrayList();
		//dynamic array
		//can contain duplicate values/elements
		//maintains insertion order
		//allow random access to fetch the elements because it stores elements base on the indexes 
		al.add(10);
		al.add(20);
		System.out.println(al.size());
		System.out.println("----------------");
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al.size());
		System.out.println("---------------");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//to add integers
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(1);
		//ar.add("Vishal");--error
		
		//To add string
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Sangeetha");
		System.out.println("-----------------------");
		
		//to add alldatatype generic
		ArrayList<Employee> ar3= new ArrayList<Employee>();
		 Employee emp1=new Employee("Lalith", 44, 50000);
		 Employee emp2=new Employee("Sangeetha", 40, 50000);
		 Employee emp3=new Employee("Akash", 25, 70000);
		 Employee emp4=new Employee("Pooja", 24, 70000);
		 Employee emp5=new Employee("Vishal L", 22, 70000);
		 
		 ar3.add(emp1);
		 ar3.add(emp2);
		 ar3.add(emp3);
		 ar3.add(emp4);
		 ar3.add(emp5);
		 
		 Iterator<Employee> it=ar3.iterator();
		 while(it.hasNext()) {
			 Employee emp=it.next();
			 System.out.println(emp.name);
			 System.out.println(emp.age);
			 System.out.println(emp.salary);
		 }
		 
		 
		 System.out.println("------------------------");
		 //Add all
		 ArrayList<String> ar4=new ArrayList<String>();
		 ar4.add("Sangeetha");
		 ar4.add("Lalith");
		 ar4.add("Akash");
		 ar4.add("Pooja");
		 ar4.add("Vishal L");
		 
		 
		 ArrayList<String> ar5=new ArrayList<String>();
		
		 ar5.add("Sagar");
		 ar4.addAll(ar5);
		 for(int i=0;i<ar4.size();i++) {
			 System.out.println(ar4.get(i));
		 }
		 
		 System.out.println("------------------");
		 //remove all
		 ar4.removeAll(ar5);
		 for(int i=0;i<ar4.size();i++) {
			 System.out.println(ar4.get(i));//removing sagar
		 }
		 
		 
		 System.out.println("------------------------------------------------");
		 //intersection
		 ArrayList<String> ar6=new ArrayList<String>();
		 ar6.add("c");
		 ar6.add("b");
		 ArrayList<String> ar7=new ArrayList<String>();
		 ar7.add("c");
		 ar6.retainAll(ar7);
		 for(int i=0;i<ar6.size();i++) {
			 System.out.println(ar6.get(i));//printing c
		 }
		 
		 		
		
		
		
		
		
		
		
		
		
	}

}
