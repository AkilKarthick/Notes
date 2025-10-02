package codingPratice;

import java.util.Scanner;

public class calcul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		System.out.println("enter the numbers : " + number1 + number2);
		
		System.out.println("enter the operators(+ - )");
		char oper = sc.next().charAt(0);
		
		
		switch(oper) {
		
		case '+' : System.out.println("addition: " + (number1+number2));
		break;
		
		case '-': System.err.println("sub" + (number1-number2));
		break;
		
		default: System.out.println("eixt");
		
		}
		
		
		
		}
	

}
