import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
	int rollno;
	String name;
	int salary;
	public Employee(int rollno, String name, int salary) {
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
		return "Employee [rollno=" + rollno + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
class Mycom3 implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getSalary()-e2.getSalary();
	}
	
}


public class MaxMinComparator {
	public static void main(String[] args) {
		List<Employee> l = new ArrayList<>();
		l.add(new Employee(101, "Vishal", 1000));
		l.add(new Employee(102, "Akash", 10001));
		l.add(new Employee(103, "Sangeetha", 10002));
		l.add(new Employee(104, "Lalith", 10003));
		l.add(new Employee(1005, "Pooja", 100005));
		Employee maxSal = Collections.max(l,new Mycom3());
		System.out.println("Max Salary"+maxSal);
		Employee minSal = Collections.min(l,new Mycom3());
		System.out.println("Min Salary"+minSal);
		
		
		//l.stream().max(Comparator.comparing(Employee3::getSalary)).forEach(System.out::println);
	}
	

}
