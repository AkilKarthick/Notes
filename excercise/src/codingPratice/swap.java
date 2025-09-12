package codingPratice;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. Write a program to swap two numbers without using a temporary variable.
		
		int a =10;  // 1st 21
		int b =11;
		
		System.out.println("Before swapping: a = " + a + ", b = " + b);
		a = a+b; //21
		b = a-b; //  21-11 = 10
		a = a-b; //21-10 = 11
		
		System.out.println("after swapping: a = " + a + ", b = " + b);
	}

}
