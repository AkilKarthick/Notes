package oops;

public class AbstractionExample {
	
	public static void main(String[] args) {
		
		employee e= new details("akilkarthick");
		e.employeeNamefetching();
		
	}
}


abstract class employee{
	protected String name;
	
	public employee(String name){
		this.name = name;
	}
	
	public String getName() {
			return name;
	}
	// Abstract method (no implementation)
    public abstract void employeeNamefetching();
	
}
//Subclass providing implementation
class details extends employee{

	public details(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void employeeNamefetching() {
		System.out.println("employee name :" +name);
		
	}
	
	
}
