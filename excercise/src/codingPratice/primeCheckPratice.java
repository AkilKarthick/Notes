package codingPratice;

public class primeCheckPratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 6;
		boolean isPrime = true;
		
		if(number <=1 ) {
			isPrime = false;
		} else {
			for(int i=2; i<number; i++) {
				if(number % i == 0)
					isPrime = false;
					break;
			}
		}	

	if(isPrime) {
		System.out.println("prime");
	} else {
		System.out.println("not prime");
	}}}
