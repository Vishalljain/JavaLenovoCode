import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Knowledge {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("Vishal L");
		c.add(802587);//equivlent to c.add(Object O) object O replacing with Vishal L
		c.add(2.0f);
		c.remove(2.0f);//c.remove(Object O)
		
		/*Iterator i=c.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}*/
		for(Object i:c) {//When mix of dataTypes used Object..because Vishal L is obj,802587 is obj,2.0f is obj
			System.out.println(i);
		}
		
	}

}
