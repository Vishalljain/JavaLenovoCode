//For example class C extends class B and class B extends class A then this type of inheritance is known as multilevel inheritance.
//A derive class inherit from base class and as well as the derive class also act as base class to other class.
class One{
	void PrintGeeks1(){
		System.out.println("Geeks1");
	}
}
	class Two extends One{
		void PrintFor() {
			System.out.println("For");
		}
	}
		class Three extends Two{
			void PrintGeeks() {
				System.out.println("Geeks");
			
			}
		}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		Three t=new Three();
		t.PrintGeeks();
		t.PrintFor();
		t.PrintGeeks1();
		
		
	}

}
