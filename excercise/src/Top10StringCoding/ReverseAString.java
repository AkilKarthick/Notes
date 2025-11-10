package Top10StringCoding;

public class ReverseAString {

	public static void main(String[] args) {
		
		String str1 = "akil";
		String rev = new StringBuilder(str1).reverse().toString();
		System.out.println(rev);

//wihtout method
		char[] ch = str1.toCharArr();
		String revs;
		for(int i=str1.length()-1;i>=0;i--;){
			revs+=ch[i];}
		System.out.println(revs);
		
	}

}
