
public class FileRunner {
	public static void main(String[] args) {
		Fan fan = new Fan("Heaven", 0.5, "Black");
		fan.SetOn();
		System.out.println(fan);
		fan.setspeed((byte) 30);
		System.out.println(fan);
		fan.isOff();
		System.out.println(fan);
		
		
	}

}
