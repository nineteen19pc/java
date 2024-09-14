package day9;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.OptionalDouble;
import java.util.stream.Collectors;


public class DemoIntegerStream {

	public static void main(String[] args) {
		Integer [] arr = {12, 7, 23, 10, 13, 24, 21, 4, 17, 12, 72, 13, 18};
		List<Integer> ilist= Arrays.asList(arr);
		
		Stream<Integer> stream = ilist.parallelStream();
		stream.filter((n) -> n%2!=0).forEach(System.out::println);
		
		stream= ilist.parallelStream();
		List<Integer> sorted = stream.sorted(Integer::compareTo).collect(Collectors.toList());
		System.out.println(sorted);
		
		stream= ilist.parallelStream();
		Optional<Integer> first=stream.findFirst();
		if(first.isPresent())
		{
			System.out.println(first.get());
		}
		stream=ilist.stream();
		stream.map((n) -> n*10).forEach(System.out::println);
		
		System.out.println("---------------------");
		stream=ilist.stream();
		Optional<Integer> total=stream.reduce((n1,n2)-> n1+n2);
		System.out.println(total.get());
		
		stream=ilist.parallelStream();
		long sum=stream.reduce(2, (n1,n2)-> n1+n2);
		System.out.println(sum);
		
		System.out.println("---------------------");
		stream=ilist.stream();
		Optional<Integer> min=stream.min(Integer::compareTo);
		if(min.isPresent())
			System.out.println(min.get());
		
		System.out.println("---------------------");
		stream=ilist.stream();
		Optional<Integer> max=stream.max(Integer::compareTo);
		if(max.isPresent())
			System.out.println(max.get());
		
		System.out.println("---------------------");
		stream=ilist.stream();
		OptionalDouble ave=stream.mapToDouble(Double::valueOf).average();
		if(ave.isPresent())
			System.out.println(ave.getAsDouble());
		
		
		
		
	}

}
