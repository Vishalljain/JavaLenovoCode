import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraytoArrayList {
	public static void main(String[] args) {
		String[] array = {"Java","SQL","JDBC"};
		//1
		List<String> l1 = Arrays.asList(array);
		System.out.println(l1);
		
		//2
		List<String> l2 = new ArrayList();
		Collections.addAll(l2, array);
		System.out.println(l2);
		
		//3
		
		List<String> l3 = new ArrayList();
		for(String arr:array) {
			l3.add(arr);
		}
		System.out.println(l3);
		
		
		
	}

}
