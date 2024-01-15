import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee2 implements Comparable<Employee2> {
	int rollno;
	String name;
	int salary;

	public Employee2(int rollno, String name, int salary) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.salary = salary;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee2 [rollno=" + rollno + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee2 o) {
		if (this.salary > o.salary) {
			return -1;
		} else if (this.salary < o.salary) {
			return 1;
		} else {
			return 0;
		}

	}

}

public class SortComparableDescending {
	public static void main(String[] args) {
		List<Employee2> l = new ArrayList<>();
		l.add(new Employee2(101, "Vishal", 100010));
		l.add(new Employee2(102, "Akash", 10001));
		l.add(new Employee2(103, "Sangeetha", 10002));
		l.add(new Employee2(104, "Lalith", 10003));
		l.add(new Employee2(1005, "Pooja", 100005));
		Collections.sort(l);
		System.out.println(l);
		l.stream().sorted(Comparator.comparing(Employee2::getSalary).reversed()).forEach(System.out::println);
		l.stream().sorted(Comparator.comparing(Employee2::getSalary).reversed()).forEach(System.out::println);
		
	}
}
