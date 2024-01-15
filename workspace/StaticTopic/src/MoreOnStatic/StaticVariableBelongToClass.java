package MoreOnStatic;

public class StaticVariableBelongToClass {
	static int a=10;

}
class Demo{
	public static void main(String[] args) {
		System.out.println(StaticVariableBelongToClass.a);
	}
}

//if int a is not static then we need to create obj to access n print it
//StaticVariableBelongToClass c=new StaticVariableBelongToClass();
//sysout(c.a);

