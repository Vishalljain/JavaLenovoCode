//Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
//Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package.
//If you do not specify any access level, it will be the default.
//Protected: The access level of a protected modifier is within the package and outside the package through child class.
//If you do not make the child class, it cannot be accessed from outside the package.
//Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.
//The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class. We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.




package Package1;

public class Access1 {
	protected String name="Vishal" ;
	protected int rollNo=802587;

}
