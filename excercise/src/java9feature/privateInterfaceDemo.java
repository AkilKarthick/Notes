package java9feature;

public class privateInterfaceDemo {

	public static void main(String[] args) {
	
		
		
		
		interface Vehicle {
			
			default void print() {
		        startEngine();
		        System.out.println("Vehicle is ready");
		    }
//private method too included from java 9    || java 8 default & static method added
		    private void startEngine() {
		        System.out.println("Engine started");
		    }
		}

	}

}
