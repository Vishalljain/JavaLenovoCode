
public class Fan {
	
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte Speed;
	public Fan(String make, double radius, String color) {
		super();
		this.make = make;
		this.radius = radius;
		this.color = color;
	}
	
	public void SetOn() {
		this.isOn=true;
		setspeed((byte) 50);
		
	}
	public void setspeed(byte speed) {
		// TODO Auto-generated method stub
		this.Speed = speed;
		
	}

	public void isOff() {
		this.isOn=false;
		setspeed((byte) 0);
	}
	
	public String toString() {
		return String.format("make - %s , radius - %f, color - %s, isOn - %b, Speed- %d",make,radius,color,isOn,Speed);
		
	}
}
