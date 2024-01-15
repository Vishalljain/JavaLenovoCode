import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMethods {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("Manoj");
		list.add("vishal");
		list.add("Suhas");
		//list.get(2).instanceOf String;
		
		
		list.add(2,"Gurudatt");//to add specify index
		
		list.set(2,"Gurudattsanu");
		list.set(2,"Suhassanu");
		list.indexOf("vishal");//1
		System.out.println(list);
		
		//while delete choose iterator over  foreach

		
//		for(String l:list) {
//			if(l.startsWith("Suhas")) {
//				list.remove(l);
//				
//			}
//			System.out.println(l);//Manoj, vishal, suhassanu only deleted suhas
//		}
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			if(it.next().startsWith("Suhas")) {
				it.remove();
				
			}
			
		}
	System.out.println(list);//manoj,vishal
		
	
	
	List<Integer> list1 = new ArrayList();
	list1.add(100);
	list1.add(200);
	list1.add(300);
	//list1.remove(100);
	//list remove have 2 methods remove(int index) and remove(Object o)
	//so try with object
	list1.remove(Integer.valueOf(200));
	System.out.println(list1);

}
}
