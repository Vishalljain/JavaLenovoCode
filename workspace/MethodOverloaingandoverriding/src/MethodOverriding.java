
class Overriding {
	public void eat() {
		System.out.println("Animals eat");
	}
	

}
 class MOverriding extends Overriding{
	public void eat() {
		System.out.println("Humans Eat");
		
	
	}
}

public class MethodOverriding{
	public static void main(String[] args) {
		Overriding o = new MOverriding();
		o.eat();
		
	}
	
}
