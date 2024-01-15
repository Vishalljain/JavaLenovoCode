package example;

class Employee {

	   int id;
	   String name;

	   Employee(int id, String name) {
	      this.id = id;
	      this.name = name;
	   }
	}

	public class WithoutEquals {
	   public static void main(String[] args) {

	      // create objects
	      Employee e1 = new Employee(101, "Emma");
	      Employee e2 = new Employee(102, "Oliver");
	      Employee e3 = e1;
	      Employee e4 = new Employee(101, "Emma");

	      // display details
	      System.out.println(e1.id+" "+ e1.name);
	      System.out.println(e2.id+" "+ e2.name);
	      System.out.println(e3.id+" "+ e3.name);
	      System.out.println(e4.id+" "+ e4.name);

	      // compare objects
	      System.out.println(e1.equals(e2)); // false
	      System.out.println(e1.equals(e3)); // true
	      System.out.println(e1.equals(e4)); // false
	   }
	}


