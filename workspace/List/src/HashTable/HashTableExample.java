package HashTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableExample {
	public static void main(String[] args) {
		//similar to hashmap but it is synchronized(t1,t2,t3 if t1 is accessing this obj then t2 cant until one process is complete then t2
		//stores the values on the basis of key value
		//key(is specified as object and each object have unique hash code)
		//java provides particular hashcode to a object which is  32 bit signed integer number
		// but in case of cloning (copying of obj menans two obj are same) hashcode will be same
		
		Hashtable ht1= new Hashtable();
		ht1.put(1,"Vishal");
		ht1.put(2,"suhas");
		ht1.put(3,"Anmol");
		ht1.put(2,"suhas");//unique so print once
		//ht1.put(null,"Sathya");//no null key n value--->Null point exception
		//ht1.put(4,null);
		System.out.println(ht1);


//cloning...>shallow coy-->duplicate copy of an object
	Hashtable ht2= new Hashtable();
	ht2=(Hashtable)ht1.clone();
	System.out.println(ht2);
	
	//ht1.clear();
	System.out.println(ht1);
	System.out.println(ht2);
	
	//contains
	Hashtable ht3= new Hashtable();
	ht3.put(1,"Vishal L");
	ht3.put(2,"Krishna");
	ht3.put(3,"Varun");
	ht3.contains("Vishal L");
	
	System.out.println("Great found");
	
	
	//print all the values of hashtable using enumeration
	System.out.println("-----using enumeration");
	Enumeration e=ht3.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	//get all values using entry set
	System.out.println("----using entry set");
	Set s =ht3.entrySet();
	System.out.println(s);
	
	//check both hashtables objects are equal or not
	Hashtable ht4= new Hashtable();
	ht4.put(1,"Vishal L");
	ht4.put(2,"Subhash");
	
	Hashtable ht5= new Hashtable();
	ht5.put(1,"Vishal L");
	ht5.put(2,"Subhash");
	if(ht5.equals(ht4)) {
		System.out.println("They are equal");
		
	}
	//get a value from a key
	System.out.println("get a value from a key");
	System.out.println(ht5.get(1));
	System.out.println("getting hash code of an object");
	System.out.println("The has code value a: "+ht5.hashCode());
	System.out.println("The has code value b:"+ht4.hashCode());
	System.out.println("The has code value c:"+ht3.hashCode());
	System.out.println("The has code value d:"+ht2.hashCode());//beacuse of cloning ht2 n ht1 hashcode are same
	System.out.println("The has code value e:"+ht1.hashCode());
	
	
	
	
	}	

}
