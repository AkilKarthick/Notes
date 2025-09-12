package codingPratice;

import java.util.Scanner;

public class primeNumberorNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		System.out.println("enter the number to check prime or not: " + number );
		boolean isPrime = true;
		
		if(number <=1) {
			isPrime = false;
		}else {
			for(int i=2; i<number; i++) {
				if(number % i==0) {
					isPrime = false;
					break;
				}
			}
		}
			if(isPrime) {
				System.out.println("prime number");
			}else {
				System.out.println("not a prime number");
			}
		}
	}
