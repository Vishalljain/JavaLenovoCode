package HCL.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.text.html.parser.Entity;

class Employee
{
    int id;
     
    String name;
     
    int age;
     
    String gender;
     
    String department;
     
    int yearOfJoining;
     
    double salary;
     
    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
     
    public int getId() 
    {
        return id;
    }
     
    public String getName() 
    {
        return name;
    }
     
    public int getAge() 
    {
        return age;
    }
     
    public String getGender() 
    {
        return gender;
    }
     
    public String getDepartment() 
    {
        return department;
    }
     
    public int getYearOfJoining() 
    {
        return yearOfJoining;
    }
     
    public double getSalary() 
    {
        return salary;
    }
     
    @Override
    public String toString() 
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }
    
}

public class EmployeeInfo{
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		//male n female count
		//In this query, we use Collectors.groupingBy() method which takes two arguments. We pass Employee::getGender as first argument which groups the input elements based on gender and Collectors.counting() as second argument which counts the number of entries in each group.
		
				Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
				System.out.println(collect);
				System.out.println("*************************");
				
		//distinct department4
				employeeList.stream().map(e->e.getDepartment()).distinct().forEach(System.out::println);//or
				employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
				System.out.println("*************************");
				
			//avg age
				Map<String, Double> collect2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
				System.out.println(collect2);
				System.out.println("*************************");
				
				//highest salary
				Optional<Employee> collect3 = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
				Optional<Employee> max = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
				System.out.println(max);
				System.out.println(collect3);
				Employee employee = max.get();
				System.out.println("HighestPaidEmployeeAge : "+employee.getAge());
				System.out.println("HighestPaidEmployeeName : "+employee.getName());
				System.out.println("*************************");
				
				//employee who joined after 2015
				employeeList.stream().filter(e->e.getYearOfJoining()>2015).map(e->e.name).forEach(System.out::println);
				System.out.println("*************************");
				
				//count no of emp in each department
				Map<String, Long> collect4 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
				System.out.println(collect4);
				Set<Entry<String,Long>> set = collect4.entrySet();
				for(Entry<String,Long> hello : set) {
					System.out.println(hello.getKey()+"::"+hello.getValue());
				}
				System.out.println("*************************");
				
				//What is the average salary of each department?
				Map<String, Double> collect5 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
				System.out.println(collect5);
				System.out.println("*************************");
				
				//Get the details of youngest male employee in the product development department
				
				Optional<Employee> min = employeeList.stream().filter(e->e.getGender()=="Male"  && e.getDepartment()=="Product Development").min(Comparator.comparingInt(Employee::getAge));
			//Optional<Employee> min1 = employeeList.stream().filter(Employee::=="Male"  && e.getDepartment()=="Product Development").min(Comparator.comparingInt(Employee::getAge));
				
				employeeList.stream()
	            .filter(e -> e.getGender()=="Male" && e.getDepartment()=="Product Development")
	            .min(Comparator.comparingInt(Employee::getAge));
				System.out.println(min);
				System.out.println("*************************");
				
				//Who has the most working experience in the organization?
				
				Optional<Employee> findFirst = employeeList.stream().sorted(Comparator.comparingInt(e->e.getYearOfJoining())).findFirst();
				Employee employee2 = findFirst.get();
				System.out.println(employee2.name);
				List<Integer> collect6 = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).map(e->e.getYearOfJoining()).collect(Collectors.toList());
				System.out.println(collect6);
				System.out.println("*************************");
				//male n female in sales department
				
				Map<String, Long> collect7 = employeeList.stream().filter(e->e.getDepartment()=="Sales And Marketing").collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
				System.out.println(collect7);
				System.out.println("*************************");
				//avg salary of male n female
				Map<String, Double> collect8 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
				System.out.println(collect8);
				System.out.println("*************************");
				
				//List down the names of all employees in each department?
				Map<String, List<Employee>> collect9 =employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
				System.out.println(collect9);
				Set<Entry<String, List<Employee>>> set1 = collect9.entrySet();
				for(Entry<String, List<Employee>> a : set1) {
					System.out.println("---------");
					System.out.println(a.getKey());
					List<Employee> value = a.getValue();
					for(Employee z : value) {
						System.out.println(z.getName());
					}
				}
				//What is the average salary and total salary of the whole organization
				//For this query, we use Collectors.summarizingDouble() on Employee::getSalary which will return statistics of the employee salary like max, min, average and total.
				DoubleSummaryStatistics collect10 = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
				System.out.println("Avg"+collect10.getAverage());
				System.out.println("Tot"+collect10.getSum());
				System.out.println("*************************");
				
				// Who is the oldest employee in the organization? What is his age and which department he belongs to?
				Optional<Employee> max2 = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
				System.out.println(max2);
				Employee employee3 = max2.get();
				System.out.println(employee3.getAge());
				System.out.println(employee3.getName());
				
				//top 3 salary
				
				
			employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).forEach(System.out::println);
			System.out.println("*************************");
			//after specified date
			List<String> collect11 = employeeList.stream().filter(e->e.yearOfJoining > 2011 && e.yearOfJoining<2015).map(e->e.name).distinct().collect(Collectors.toList());
				System.out.println(collect11);
				
				
	
	}
	
}
