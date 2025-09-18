package java8;

public class MultipeParamLambdaeg {

	public static void main(String[] args) {
		
		Function addition = (a,b) -> a+b;
		Function sub = (a,b) ->a-b;
		
		System.out.println(addition.operation(1, 2));
		System.out.println(sub.operation(1, 2));

	}

	@FunctionalInterface
	interface Function{
		int operation(int a, int b );
	}
}

