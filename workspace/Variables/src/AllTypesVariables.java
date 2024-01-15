         
public class AllTypesVariables {
	int myVariable;
	   static int data = 30;
	   
	   public static void main(String args[]){
	      int a = 100;
	      AllTypesVariables obj = new AllTypesVariables()   ;
	      
	      System.out.println("Value of instance variable myVariable: "+obj.myVariable);
	      System.out.println("Value of static variable data: "+AllTypesVariables.data);
	      System.out.println("Value of local variable a: "+a);
	   }

}
 