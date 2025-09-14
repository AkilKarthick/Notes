package Top10StringCoding;

public class RemoveAllWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello this is akilkarthick";
		char[] cs = s1.toCharArray();
		
		//Regex Patterns
		
		String r = s1.replaceAll("\s", " + ");
		System.out.println(r);
		
	}

}
