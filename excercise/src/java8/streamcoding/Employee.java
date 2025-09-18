package java8.streamcoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Employee {
	
	 private String name;
	    private double salary;

	    public Employee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    
	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
	            new Employee("John", 50000),
	            new Employee("Jane", 75000),
	            new Employee("Adam", 60000),
	            new Employee("Eve", 75000),
	            new Employee("Chris", 40000)
	        );

		Optional<Double> secondhighestsal = empList.stream()
													.map(s->s.getSalary())
													.distinct()
													.sorted(Comparator.reverseOrder())
													.skip(1)
													.findFirst();
		System.out.println(secondhighestsal);
	}
	}

	