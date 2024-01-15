/*
 * Here the class name is StaticMethod see above
 * Static methods belongs to class not to object.
 * Static method can be directly called by className such as ClassName.methodName.For ex we create a method public static test()
 * ...>StaticMethod.Test();
 * So we no need to create object we can directly call using class(when u create object memory is created)..Memory Management
 * 
 * Normal Method ex()
 * class StaticMethod(){                                                           
 * public test(){
 * sop("1"):
 * }
 * psvm(){
 * StaticMethod s=new StaticMethod();
 * s.test();
 * }
 * 
 * 
 * * class StaticMethod(){
 * public static test(){
 * sop("1"):
 * }
 * psvm(){
 * StaticMethod.test();
 * }
 *static method can access only static data. 
*/





public class StaticMethod {
	public static void test() {
		System.out.println(1);
	}
	public static void main(String[] args) {
		test();//or StaticMethod.test()
		Xyz.show();//not show()..not work here
	}
	

}
class Xyz {
	static void show() {
		System.out.println("2");
	}
	
}
