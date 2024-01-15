//We can convert the array to list by traversing the array and adding the element in the list one by one using the list.add
import java.util.ArrayList;
import java.util.List;

public class ArraytoList {
	public static void main(String[] args) {
		String array[]= {"Java","Phyton","Angular"};
		List<String> l1 = new ArrayList();
		
		for(String hello:array) {
			l1.add(hello);
		}
		l1.add("SQL");
		System.out.println(l1);
	}
	

}
