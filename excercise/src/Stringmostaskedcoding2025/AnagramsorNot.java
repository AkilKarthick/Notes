package Stringmostaskedcoding2025;

import java.util.Arrays;

public class AnagramsorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "silent";
		String s2 = "listen";
		
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(Arrays.equals(a1, a2)) {
			System.out.println("anagram");
		}else
			System.out.println("not anagram");
	}

}
