//Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.

package package1;

public class Access1 {
	private String name="Vishal";
	private int roll_No=802587;
	public static void main(String[] args) {
		
	
	Access1 a=new Access1();
	System.out.println(a.name);
	System.out.println(a.roll_No);
	
	}
}
