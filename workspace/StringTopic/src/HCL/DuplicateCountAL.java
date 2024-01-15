package HCL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateCountAL {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("Bangalore");
		list.add("Bangalore");
		list.add("Bangalore");
		list.add("Bhadravati");
		list.add("Bhadravati");
		list.add("Bhadravati");
		list.add("Bhadravati");
		list.add("Bhadravati");
		list.add("Pune");
		
		System.out.println("The count of Bhadravati : "+Collections.frequency(list, "Bhadravati"));//single element count
		
		Set<String> set = new HashSet(list);
		//System.out.println(set);
		for(String temp : set) {
			System.out.println(temp+":"+Collections.frequency(list, temp));
		}
	} 

}
