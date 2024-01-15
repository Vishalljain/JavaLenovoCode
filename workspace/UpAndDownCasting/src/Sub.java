//Typecasting is converting one data type to another.

//Up-casting − Converting a subclass type to a superclass type is known as up casting.

class Machine {
	public void start() {
		System.out.println("Machine started");
	}
}

class camera extends Machine {
	public void start() {
		System.out.println("Camera started");
	}

	public void snap() {
		System.out.println("Photo taken:)");
	}

}

public class Sub {
	public static void main(String[] args) {
		Machine machine = new Machine();
		camera camera = new camera();
		machine.start();// Machine started
		camera.start();// Camera started
		camera.snap();// Photo taken:)

		// UPCASTING

		Machine machine2 = camera;
		machine2.start();// camera started
		// machine2.snap();error due to snap method is not there in parent class

		// DOWNCASTING
		Machine machine3 = new camera();
		camera camera2 = (camera) machine3;
		camera2.start();// camera started
		camera2.snap();//Photo taken:)

		// not possible run time error
		Machine machine4 = new Machine();// Machine cannot be cast to camera
		camera camera4 = (camera) machine4;
		camera4.start();
		camera4.snap();

	}
}