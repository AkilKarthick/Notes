package java8;

public class Lambdaeg1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Lambda expressions provide a concise way to 
		 * implement a functional interface without creating a separate class.
		 * 
		 * Normally, before Java 8, you would write something like
		 * 
		 * class Test implements FuncInterface {
			    public void abstractFun(int x) {
			        System.out.println(2 * x);
			 but wiht lambda expression check below
		 */
		FuncInterfac fobj = (int x)->System.out.println(x * 2);
		
		//no instantiation just reference of lambda is procided as fobj
		fobj.abstractFun(12);
	}

	interface FuncInterfac{
		void abstractFun(int x);
	}
}
