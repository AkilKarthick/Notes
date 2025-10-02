package codingPratice;

import java.util.List;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
//		int a =10;
//		int b =1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number: ");
		int c = sc.nextInt();
		
		System.out.println("enter the second number: ");
		int d = sc.nextInt();
		
		System.out.println("enter the operators(+ - )");
		char op = sc.next().charAt(0);
		
//		String operator = "addition";

		switch(op) {
		
		case '+': 
			System.out.println("addition:" + (c+d));
			break;
		case'-': 
			System.out.println("");
			break;
		default:
			System.out.println("");
		}
	}

}
