package excercise;

public class ifElseifexmaple {

	public static void main(String[] args) {
		
		//if else if
		double balance=300;
		double amount =10;
		
		if (amount <=0) {
			System.out.println("withdraw failed amount is negative");
			
		}else if ( amount > balance) {
			System.out.println("withdraw failed amount is low");
	}
		else {
			balance-= amount;
				System.out.println("withdra succeed" + balance);
		}

	}

}
