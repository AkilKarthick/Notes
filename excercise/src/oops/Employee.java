package oops;

//parent class
public class Employee {

	String name;
	double salary;
	
	Employee(String name, double salary){
			this.name= name;
			this.salary=salary;
	}
	
	void display() {
			System.out.println("NAME:" +name+ ", salary:" + salary);
	}
}

//single inheritance

class Manager extends Employee{
	
	String department;
	
	Manager(String name, double salary, String department){
			super(name,salary);
			this.department=department;
	}
	
	void display() {
		System.out.println("name:" + name);
			System.out.println("department:" + department);
	}
}

//multiplevel inheritance


class seniorManager extends Manager{

	int yearOfExperince;
	
	seniorManager(String name, double salary, String department, int yearOfExperince) {
		super(name, salary, department);
		this.yearOfExperince= yearOfExperince;
		
	}
	
	void display() {
			System.out.println("employee name:" +name);
			System.out.println("employee sal: " + salary + "department: " + department);
			System.out.println("experience" + yearOfExperince);
	}
	
}
	//hierarchical inheritnace
	
	 class Developer extends Employee{
		
		String skills;
		
			Developer(String name, double salary,String skills) {
			super(name, salary);
			this.skills=skills;
			// TODO Auto-generated constructor stub
		}
			
			void display() {
					super.display();
					System.out.println("skills :" +skills);
			}
	 }
			class Tester extends Employee{

				String framework;
				
				Tester(String name, double salary,String framework) {
					super(name, salary);
					this.framework=framework;
					
				}
				
				void display() {
					super.display();
					System.out.println("framworkd :" +framework );
				}
			}
			
	
		


