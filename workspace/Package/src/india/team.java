//A java package is a group of similar types of classes, interfaces and sub-packages.

//Package in java can be categorized in two form, built-in package and user-defined package.
//Java package is used to categorize by the classes and interfaces.
//It is easy to maintained.
//Java package is provide as access protection.
//It may removes naming collision.
//This packages can be provide reusability of code.
//We can create our own package or extend already available package.


package india;

public class team {
	String name;
	String position;
	String dressColor;
	public team(String name, String position, String dressColor) {
		super();
		this.name = name;
		this.position = position;
		this.dressColor = dressColor;
	}
	public void display() {
		System.out.println("Team India");
		System.out.println("Name :"+ name);
		System.out.println("Position :"+ position);
		System.out.println("DressColor :"+ dressColor);
	}

}
