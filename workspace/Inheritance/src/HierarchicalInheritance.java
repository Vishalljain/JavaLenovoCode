//When two or more subclasses inherits a single class, it is known as hierarchical inheritance.
//In the example given below, Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance.

class Animal1 {
	void eat() {
		System.out.println("Animal eat");
	}
}

class Dog1 extends Animal1 {
	void bark() {
		System.out.println("Dog Barks");
	}
}

class Cat extends Animal1 {
	void meow() {
		System.out.println("Cat not Barks");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Cat c =new Cat();
		c.eat();
		//c.bark();....error
		c.meow();
	
	}

}
