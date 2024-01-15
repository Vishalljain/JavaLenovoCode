class Apple{
	int age;
	String name;
	void speak(String text) {
		System.out.println(text);
	}
	void jump(int height) {
		System.out.println(height);
	}
	void car(int tyres,String color) {
		System.out.println("The car has"+ tyres +"the color is "+ color);
	}
	



}

public class App {

	public static void main(String[] args) {
		Apple a1=new Apple();
		a1.speak("Hi This is Vishal");
		a1.jump(20);
		a1.car(4," Black");
		String greeting="Congrtas for 20 lakhs car";
		a1.speak(greeting);
		
		

	}

}
