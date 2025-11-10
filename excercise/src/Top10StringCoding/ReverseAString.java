package Top10StringCoding;

public class ReverseAString {

	public static void main(String[] args) {
		
		String str1 = "akil";
		String rev = new StringBuilder(str1).reverse().toString();
		System.out.println(rev);

//wihtout method
		cha[] ch = str1.toCharArray();
		String rever =" "
			for(int i= str1.length()-1; i>=0; i--){
			revs+ = ch[i];
			}
//reverse an elements //without any method
		int[] arr ={12,23,34,45,56,67};
		int startIndex = arr[0];
		int endIndex = arr[0];
//u9sing while iterationg
		while(startIndex < endIndex){
			int temp = arr[startIndex];
			arr[startIndex] =  arr[endIndex];
			arr[endIndex] = temp;

			startIndex++;
			endIndex--;
		}
		for(int s: arr){
			System.out.println(s);
		}
		
	}

}
