package codingPratice;

public class VowelConsonentCountingPgm {

	public static void main(String[] args) {
		
		int vowelsCount =0, consonenetCount=0;
		
		String word = "Akil";
		
		word = word.toLowerCase();
		
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u') {
					vowelsCount++;
				}else {
					consonenetCount++;
				}
			}
		}
		
		System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonenetCount);
	}

}
