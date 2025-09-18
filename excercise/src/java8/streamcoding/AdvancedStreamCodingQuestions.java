package java8.streamcoding;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedStreamCodingQuestions {

	public static void main(String[] args) {
		
		List<List<Integer>> listoflists = Arrays.asList(
				Arrays.asList(1,2),
				Arrays.asList(3,4,5),
				Arrays.asList(6,7,8,9,10)
				);
		
		List<Integer> flatList = listoflists.stream()
				.flatMap(list -> list.stream()).collect(Collectors.toList());
//		.flatMap(Collection::stream)
		System.out.println(flatList);
				
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		
		Map<Boolean, List<Integer>> partitioned = numbers.stream()
			    .collect(Collectors.partitioningBy(n -> n % 2 == 0));

			System.out.println(partitioned);
			
//Group strings by length:
			
			List<String> fruits = Arrays.asList("bana","app","ora");
			Map<Integer, List<String>> groupedByLength = fruits.stream()
				    .collect(Collectors.groupingBy(s -> s.length()));
//groupingBy(String::length))
				System.out.println(groupedByLength);
				//
				Double avglength = fruits.stream().collect(Collectors.averagingInt(s ->s.length()));
				System.out.println(avglength);
				
				//
				String result = fruits.stream()
					    .collect(Collectors.joining("+ ", "!", "@"));

					System.out.println(result);  // Output: [Banana, Apple, Orange]

				

	}

}
