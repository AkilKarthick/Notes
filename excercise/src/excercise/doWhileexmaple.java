package excercise;

import java.util.Scanner;

public class doWhileexmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double balance = 0;
		double minbal = 500;
		double depositAmt =0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("rs have been added to the account");
//			depositAmt +=1000;
			depositAmt = sc.nextInt();
		} while(depositAmt < minbal);
		balance = depositAmt;
		System.out.println("transcatrion completed" + balance);
	}

}
