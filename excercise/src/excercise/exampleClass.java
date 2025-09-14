package excercise;

public class exampleClass {
	
	String name;
	String color;
	
	void startEngine() {
			System.out.println(name + " engine started.");
	}
	
	void drive() {
        System.out.println(name + " is driving.");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		exampleClass obj1 = new exampleClass();
		obj1.name = "toyato";
		obj1.color = "red";
		
		obj1.startEngine();
		
		exampleClass  ob2 = new exampleClass();
		ob2.name= "susuki";
		
		ob2.startEngine();
		
		

	}

}
