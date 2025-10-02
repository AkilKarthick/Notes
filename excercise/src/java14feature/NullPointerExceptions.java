package java14feature;

public class NullPointerExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = null;
		System.out.println(s.length());
		//The exception message now clearly indicates that s was null.

//java 14 enhanced the error messages for NullPointerExceptions to include information about what exactly was null, making debugging easier.
	}

}
