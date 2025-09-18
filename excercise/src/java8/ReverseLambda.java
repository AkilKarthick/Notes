package java8;

public class ReverseLambda {

	public static void main(String[] args) {
		
		MyInterface rev = (str) -> new StringBuilder(str).reverse()
													.toString();
		System.out.println(rev.reverse("akilkarthick"));
	}

	@FunctionalInterface
	interface MyInterface {
		String reverse(String n);
	}
}
