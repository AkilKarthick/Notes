package java10feature;

import java.util.ArrayList;

public class VarExample {

	
//	var number2 = 20;
	
	
	public static void main(String[] args) {
		 
//		int number =10;
//		var number1 = 11;
		
		/*
		 * 
		 * var keyword for local variable declarations,
		 *  letting the compiler infer the variable type from the initializer.
		 *  Only works for local variables with initialization.

			Cannot be used for fields, method parameters, or return types.
		 */
		
		
//		System.out.println("number is :" + number);
//		System.out.println("number1  is :" + number1);
		
		var number = 10;           // inferred as int
        var message = "hello";     // inferred as String
        
        var list = new ArrayList<String>();  // inferred as ArrayList<String>

        System.out.println(number);
        System.out.println(message);
        System.out.println(list);
	}

}
