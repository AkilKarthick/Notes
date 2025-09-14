package Top10StringCoding;

import java.util.Arrays;

public class AnagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st1 = "listen";  //secure or rescue
		String st2 = "silent";
		
		char[] s1 = st1.toCharArray();
		char[] s2 = st2.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		if(Arrays.equals(s1, s2)) {
			System.out.println("anagarm");
		}else
			System.out.println("not");
		
		

	}

}
