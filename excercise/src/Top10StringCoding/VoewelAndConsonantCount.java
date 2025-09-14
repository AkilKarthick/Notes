package Top10StringCoding;

public class VoewelAndConsonantCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "akil";
		int vow=0;
		int consonent =0;
		
		 String sc = str1.toLowerCase();
				 
		for(int i=0; i<sc.length(); i++) {
			char c = sc.charAt(i);
			
			if(c >= 'a' && c <='z') {
				if(c =='a' || c == 'e' || c =='i' || c == 'o' || c =='u') {
					vow++;
				}else
					consonent++;
				
			}
			
		}
		System.out.println("con:" + consonent);
		System.out.println("vow" + vow);
	}

}
