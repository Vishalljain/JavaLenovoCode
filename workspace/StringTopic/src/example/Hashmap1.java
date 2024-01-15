package example;

import java.util.*;
class A {
   public String toString() {
      return "A ";
   }
   public void finalize() {
      System.out.println("Finalize method");
   }
}
public class Hashmap1 {
   public static void main(String args[])throws Exception {
      HashMap hMap = new HashMap();
      A obj = new A();
      hMap.put(obj, " Apple ");
      System.out.println(hMap);
      obj = null;
     // System.out.println(obj);
      System.gc();
      Thread.sleep(5000);
      System.out.println(hMap);
   }
}
