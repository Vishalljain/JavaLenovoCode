//inheritance-It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class.
//advantage:1.For Method Overriding (so runtime polymorphism can be achieved).
//2.For Code Reusability.
///single inheritance:When a class inherits another class, it is known as a single inheritance. 
//In the example given below, Dog class inherits the Animal class, so there is the single inheritance.


class Animal {
	void eat() {
		System.out.println("dog eat");
	}
}
 class Dog extends Animal {
	void bark() {
		System.out.println("Dog bark");
	}
}
public class SingleInheritance{
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.bark();
				
	}
	

}
