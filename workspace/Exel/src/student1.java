
public class student1 {
	
	int physics;
	int maths;
	int social;
	public student1(int physics, int maths, int social) {
		super();
		this.physics = physics;
		this.maths = maths;
		this.social = social;
	}
	@Override
	public String toString() {
		return "st1 [physics=" + physics + ", maths=" + maths + ", social=" + social + "]";
	}

	
	
	public static void main(String[] args) {
		student1 s1 = new student1(100,95,90);
		student1 s2 = new student1(100,95,98);
		System.out.println(s1.toString());
		String string = s2.toString();
		System.out.println(string);
	
	
	}
	
	

}
