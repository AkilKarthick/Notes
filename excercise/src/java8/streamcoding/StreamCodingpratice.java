package java8.streamcoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamCodingpratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//filter a list basedon condition
		
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8);
		l1.stream().filter(s->s>4)
								.collect(Collectors.toList())
								.forEach(System.out::println);
		
		//even number
		List<Integer> s1 = l1.stream()
							.filter(s -> s%2 ==0)
							.collect(Collectors.toList());
		System.out.println(s1);
		
		//square root of number in a list
		
		List<Integer> squ = l1.stream()
								.map(n-> n*n)
								.collect(Collectors.toList());
		System.out.println(squ);
		
		// 4.sum of numbers using reduce
		List<Integer> l4 = Arrays.asList(1,2,3);
		Integer sum = l4.stream().reduce(0,(a,b) -> a+b);
		System.out.println("sum of a & b is : "+sum);
		
		//maxnumber in s laist
		
		Optional<Integer> maxNumber = l1.stream().max(Integer::compare);
		maxNumber.ifPresent(System.out::println);
		
		//sort aphphabetically
		
		List<String> fruits = Arrays.asList("banana","apple","orange","carrot");
		 //used to find second highest salary
		Optional<String> op = fruits.stream()
								.sorted(Comparator.reverseOrder()).skip(3).findAny();
//								.collect(Collectors.toList());
		System.out.println("ascending order ::: " +op);
		
		
		//convert list of string to uppercase
		
		List<String> uppercase = fruits.stream().sorted()
										.map(s->s.toUpperCase())
										.collect(Collectors.toList());
		System.out.println(uppercase);
		
		
		//count string starging with specific letter
		
		long count = fruits.stream().filter(c -> c.startsWith("a")).count();
		System.out.println(count);
		
		//find the first String starting wiht '0'
		
		Optional<String> find = fruits.stream().filter(s -> s.startsWith("a")).findFirst();
		System.out.println(find);
		
		//remove duplicate elements from the list
		
		List<Integer> l2 = Arrays.asList(13,4,4,4,6);
		List<Integer> duplicate = l2.stream()
									.distinct()
									.collect(Collectors.toList());
		System.out.println(duplicate);
		
		//limit list of numbers of element in a stream
		
		List<Integer> limitedlist = l2.stream().limit(2)
												.collect(Collectors.toList());
		System.out.println(limitedlist);
		
	}

}
