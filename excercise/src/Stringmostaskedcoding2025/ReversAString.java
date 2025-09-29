package Stringmostaskedcoding2025;

public class ReversAString {

	public static void main(String[] args) {
		//with method 
		
		String s1 = "Akil";		
//		StringBuilder rev = new StringBuilder(s1).reverse();	
//		System.out.println(rev);

		
		//witout method
		
		String original = "Akil";
		String reversed = "";		
		for(int i = original.length()-1; i>=0; i--) {
			reversed += original.charAt(i);
			
			}
		System.out.println(reversed);
	}
}