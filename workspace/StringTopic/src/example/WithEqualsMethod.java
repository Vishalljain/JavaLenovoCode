package example;

class Employee1 {

	   int id;
	   String name;

	   Employee1(int id, String name) {
	      this.id = id;
	      this.name = name;
	   }

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	   

}

	public class WithEqualsMethod {
	   public static void main(String[] args) {

	      // create objects
	      Employee1 e1 = new Employee1(101, "Emma");
	      Employee1 e2 = new Employee1(102, "Oliver");
	      Employee1 e3 = e1;
	      Employee1 e4 = new Employee1(101, "Emma");

	      // compare objects
	      System.out.println(e1.equals(e2)); // false
	      System.out.println(e1.equals(e3)); // true
	      System.out.println(e1.equals(e4)); // true
	   }
	}
