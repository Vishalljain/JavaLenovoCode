
public class Student {
	
	int physics;
	int maths;
	int social;
	public Student(int physics, int maths, int social) {
		super();
		this.physics = physics;
		this.maths = maths;
		this.social = social;
	}
	
	
	
	public void findAverage() {
		 System.out.println((physics+maths+social)/3);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(100,95,90);
		Student s2 = new Student(100,95,98);
		s1.findAverage();
		s2.findAverage();
	
	
	}
	
	

}
