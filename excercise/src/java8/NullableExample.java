package java8;

import java.util.Optional;

public class NullableExample {

	public static void main(String[] args) {
		
		String s1;
		s1 = " ";
		Optional<String> opcheck = Optional.of(s1);
		opcheck.map(String::toUpperCase).ifPresentOrElse(System.out::println, () -> System.out.println("name not found"));
//		System.out.println(opcheck.isEmpty());
	}
}
