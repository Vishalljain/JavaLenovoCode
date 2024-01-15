import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee1 implements Comparable<Employee1>{
	int rollno;
	String name;
	int salary;
	public Employee1(int rollno, String name, int salary) {
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
		return "Employee1 [rollno=" + rollno + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		//return this.salary-o.salary;
		return this.getSalary()-o.getSalary();
	}
	
}


public class MaxMinComparable {
	public static void main(String[] args) {
		List<Employee1> l = new ArrayList<>();
		l.add(new Employee1(101, "Vishal", 1000));
		l.add(new Employee1(102, "Akash", 10001));
		l.add(new Employee1(103, "Sangeetha", 10002));
		l.add(new Employee1(104, "Lalith", 10003));
		l.add(new Employee1(105, "Pooja", 100005));
		Employee1 maxSal = Collections.max(l);
		System.out.println("Max Salary"+maxSal);
		Employee1 minSal = Collections.min(l);
		System.out.println("Min Salary"+minSal);
	}

}
