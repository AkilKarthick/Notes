package oops;

public class inheritanceAllTypeExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//employee object
//		Employee e = new Employee("akil",123);
//		e.display();
//		
//		//single inheritance
//		Manager mg = new Manager("sanjay",1234,"walmart");
//		mg.display();
//		
//		
//		//multilevel inheritnace
//		
//		seniorManager sm = new seniorManager("pinkman",12345,"walmart",19);
//		sm.display();
//		
//		//hierarchy inheritnace
//		
//		Developer dev = new Developer("akildev",89999,"java");
//		dev.display();
//		
//		Tester t = new Tester("dhaya",9898,"cucumberFramworkd");
//		t.display();
//	}
	
		 // Superclass reference referring to subclass object (polymorphism)
        Employee emp;
        
     // Reference to Manager object
        emp = new Manager("Alice", 80000, "HR");
        emp.display();   // Calls Manager's overridden display()
        
     // Reference to SeniorManager object
        emp = new seniorManager("Bob", 120000, "Finance", 15);
        emp.display();   // Calls SeniorManager's overridden display()
	}
}


