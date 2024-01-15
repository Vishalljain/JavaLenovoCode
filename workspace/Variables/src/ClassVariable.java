//Class variables also known as static variables are declared with the static keyword in a class, but outside a method, constructor or a block.
////Static variables are created when the program starts and destroyed when the program stops.
//Static variables can be accessed by calling with the class name ClassName.VariableName.
//
public class ClassVariable {
	// salary  variable is a private static variable
	   private static double salary;

	   // DEPARTMENT is a constant
	   public static final String DEPARTMENT = "The Development department ";

	   public static void main(String args[]) {
	      salary = 1000000;
	      System.out.println(DEPARTMENT + "average salary of Vishal L:" +ClassVariable.salary);
	      System.out.println(DEPARTMENT +"average salary of Akash L:" +salary);//we dont need to write The development department again because it is constant 
	   }

}
