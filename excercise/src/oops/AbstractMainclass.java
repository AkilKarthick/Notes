package oops;

//added from github
public class AbstractMainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shape r = new Rectangle(11, 12, "shape");
		r.area();
	}

}


abstract class shape{
	
	String name;
	
	shape(String n){
		this.name=name;
	}
	
	 public void moveTo(int x, int y) {
	        System.out.println(name + " moved to x = " + x + ", y = " + y);
	    }
	 //abstract method without implementation
	 abstract double area();
}

class Rectangle extends shape{

	int lenght, width;
	
	Rectangle(int l, int w,String n){
		super(n);
		this.lenght =l;
		this.width = w;
		this.name =n;
		
	}
	@Override
	 double area() {
		System.out.println("lenght * width: " +lenght * width);
		return lenght;
	}
}
	
