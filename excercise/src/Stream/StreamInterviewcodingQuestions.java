package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamInterviewcodingQuestions {

	
	public static void main(String[] args) {
			
//1.find max number in the list
		
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6);
		int max = l1.stream().max(Integer::compare).orElseThrow();
		System.out.println("max number is:" + max);
		
		int maximum = l1.stream()
						.max((a,b)->a.compareTo(b))
						.orElseThrow();
		
		System.out.println("max number is:" + maximum);
		
		System.out.println(Integer.compare(10, 20)); // Outputs a negative value (-1)
		System.out.println(Integer.compare(20, 20)); // Outputs 0
		System.out.println(Integer.compare(30, 20)); // Outputs a positive value (1)

//2.counting even numbers
		long count = l1.stream().filter(s->s %2 ==0).count();
		System.out.println("count: " + count);
		
//3.convert list of string to uppercase
		
		List<String> s1 = Arrays.asList("Akil","karthick");
		s1.stream().map(s->s.toUpperCase()).forEach(System.out::println);
		
		s1.stream().map(String::toUpperCase).forEach(System.out::println);
		
//letter start with a
		List<String> result = s1.stream().filter(s->s.startsWith("A")).toList();
		System.out.println(result + "start with A is");
		
//find duplicate elements in the list
		
		List<Integer> l3 = Arrays.asList(1,2,3,4,5,5,5,5,6);
		Set<Integer> s11 = new HashSet<>();
		
		System.out.println("distinct values: " + s11);
		
		List<Integer> duplicates = l3.stream()
									 .filter(n -> !s11.add(n))
									 .toList();
		System.out.println(duplicates);
		System.out.println("distinct values: " + s11);
		
//get the first 3 elements in the lsit
		
		List<Integer> firstThree = l3.stream().limit(3).toList();
		System.out.println("first 3 : " + firstThree);
		
		
		
//skip the first 2 elements
		
		List<Integer> skip2 = l3.stream().skip(2).toList();
		System.out.println("skipped  : " + skip2);
		
//sum of all the elements in the list
		
		Integer sum = l3.stream()
					    .mapToInt(Integer::intValue)  //convertion to primitive stream
					    .sum();
		System.out.println(sum);
		
//using lambda
		
		Integer sum1 = l3.stream()
			    .mapToInt(i-> i)
			    .sum();
		System.out.println(sum1);
		
//chec if all the number are even
		
		boolean allEven = l3.stream().allMatch(n-> n%2 ==0);
		System.out.println(allEven);
		
		
		boolean anydiviby5 = l3.stream().anyMatch(n-> n%5 ==0);
		System.out.println(anydiviby5);
		
//sort in descending orfer
		List<Integer> sortDesc = l3.stream()
									.sorted(Comparator.reverseOrder())
									.distinct()  //remove duplicates
									.toList();
		System.out.println(sortDesc);
		
		
		List<Integer> l31 = Arrays.asList(1,2,3);
		double avg = l31.stream()
						.mapToInt(i->i)
						.average()
						.orElse(0.0);
		;
		System.out.println(avg);
		
		
//group string by lenght
		
		List<String> strings = Arrays.asList("Akil","karthick","Akil","lk");
		
		Map<Integer, List<String>> grouped = strings.stream()
												.collect(Collectors.groupingBy(s->s.length()));
		System.out.println(grouped);
		
		
//join all the string with comma
		
		String joined = strings.stream().collect(Collectors.joining("+"));
		System.out.println(joined);
		
// partition list into even & odd
		
		List<Integer> l4 = Arrays.asList(1,2,3,4,5,5,5,5,6);
		Map<Boolean, List<Integer>> partioned = l4.stream()
											.collect(Collectors.partitioningBy(n->n%2 ==0));
		System.out.println(partioned);
		
		//second highest salary
		
		int secondmaxsal = l4.stream().sorted(Comparator.reverseOrder())
									  .distinct()
									  .skip(1)
									  .findFirst()
									  .orElseThrow();
		System.out.println(secondmaxsal);
		
//find frequency of each character in a string
		
		String input = "akilkarthick";
		Map<Character, Long> freq = input.chars() //create an IntStream of character 
							.mapToObj(c ->(char) c)
							.collect(Collectors.groupingBy(c->c, Collectors.counting()));
		System.out.println(freq);
		
//Get top 3 highest numbers
		List<Integer> l5 = Arrays.asList(1,2,3,4,5,5,5,5,6);
		List<Integer> highersnumbertop3 = l5.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
		System.out.println("highest 3 is :" +highersnumbertop3);
		
	}
}
