package Generic1.com;

import java.util.ArrayList;

public class MyCustomList<T> {
	ArrayList<T> list=new ArrayList<>();
	public void addElemet(T element) {
		list.add(element);
		
	}
	public void removeElement(T element) {
		list.remove(element);
	}
	public String get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
