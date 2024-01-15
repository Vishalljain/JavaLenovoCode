package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class ll {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("panipuri");
		list.add("MasalaPuri");
		list.add("BhelPuri");
		System.out.println(list);
		list.addFirst("GobbiMunchuri");
		list.addLast("Bhaya Pani");
		System.out.println(list);
		
		//get
		System.out.println(list.get(2));
		//set
		list.set(4, "Bhaya Kitna ka ek plate");//replace gobbimanchuri
		System.out.println(list);
		
		
		//remove
		list.removeFirst();
		list.removeLast();
		list.remove(2);
		System.out.println(list);
		
		//how to print list using loops
		
		System.out.println("----------using for loop------------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------using advancefor loop------------------");
		for(String hai:list) {
			System.out.println(hai);
		}
		 System.out.println("--------using iterator loop---------");
		 Iterator<String>  it=list.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 System.out.println("----------using while loop----------");
		 int num=0;
		 while(list.size()>num) {
			
			 System.out.println(list.get(num));
			 num++;
			 
		 }
		
		
		
		
				
				
	}

}
