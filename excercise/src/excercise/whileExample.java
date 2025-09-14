package excercise;

import java.util.Scanner;



public class whileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double balance =0;
		double minbal= 500;
		double depamount =0;
		
		Scanner sc = new Scanner(System.in);
		
		
		while(depamount < minbal) {
			System.out.println("amont has been added");
			depamount = sc.nextInt();	
		}
		balance = depamount;
		System.out.println("trans completed" + balance);
	}

}
