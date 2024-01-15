import java.util.ArrayList;
import java.util.List;

public class A {

	public static void main(String[] args) {
		List<Integer> empId=new ArrayList<>();
		empId.add(1);
		empId.add(2);
		empId.add(3);
		empId.add(4);
		empId.add(5);
		empId.add(2);
		 
		List<Integer> list2=new ArrayList();
		for(Integer emp:empId) {
			if(!list2.contains(emp)) {
				list2.add(emp);
			}
		}
		//retriving 
		System.out.println(list2);

	}

}
