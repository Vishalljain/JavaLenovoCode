package example;

import java.util.WeakHashMap;

class B {
	   public String toString() {
	      return "B ";
	   }
	   public void finalize() {
	      System.out.println("Finalize method");
	   }
	}
	public class WeakHashmapDemo {
	   public static void main(String args[])throws Exception {
	      WeakHashMap whMap = new WeakHashMap();
	      B obj = new B();
	      whMap.put(obj, " Apple ");
	      System.out.println(whMap);
	      obj = null;
	     // System.out.println(obj);
	      System.gc();
	      Thread.sleep(5000);
	      System.out.println(whMap);
	   }
	}
