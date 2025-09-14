package stringpraticecoding;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String a = "madam";
		StringBuilder s = new StringBuilder("madam");
		
		StringBuilder rev =s.reverse();
		
		if(rev.equals(s)) {
			System.out.println(" string a is  palindrome");
		}else {
			System.out.println("String is not a palindrom");
		}
		

	}

}
