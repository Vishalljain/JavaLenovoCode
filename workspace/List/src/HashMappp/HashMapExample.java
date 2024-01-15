package HashMappp;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {
	public static void main(String[] args) {

		// hashmap is a class which implements hashinterface stores the values in key
		// value pairs
		// stores onlu unique elements
		// it may have one null key and mutiple null values
		// it maintains no order

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Vishal");
		hm.put(2, "Lokesh");
		hm.put(3, "Shiny");
		hm.put(4, "");

		System.out.println(hm.get(1));// vishal
		System.out.println(hm.get(4));// null

		System.out.println("--------------------");
		// getting all the values from hash map using for loop
		for (Entry m :  hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}
		System.out.println("--------------------------");

		hm.remove(4);
		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}
		System.out.println("-------------------------------");

		HashMap<Integer, Employee> hm1 = new HashMap<Integer, Employee>();
		Employee e1 = new Employee("Vishal", 22, 70000);
		Employee e2 = new Employee("Vishal L", 22, 70000);
		Employee e3 = new Employee("Vishal L Jain", 22, 70000);
		hm1.put(1, e1);
		hm1.put(2, e2);
		hm1.put(3, e3);

		for (Entry<Integer, Employee> m : hm1.entrySet()) {
			int k = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee info of " + k + ":");
			System.out.println(e.name + " " + e.age + " " + e.salary);

		}

	}
}
