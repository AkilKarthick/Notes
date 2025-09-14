package Top10StringCoding;

public class PalindromeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "madam";
		String reversed = new StringBuilder(str1).reverse().toString();
		
		if(str1.equals(reversed)) {
				System.out.println("palindrome");
		}else
			System.out.println("not a palindrome");
	}

}
