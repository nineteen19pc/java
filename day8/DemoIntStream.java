package day8;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoIntStream {
	public static void main(String[]args) {
		
		// a stream is closed after performing a terminal operations
		// to obtain a stream call Arrays.stream(arr obj)
		int [] arr = {12, 7, 23, 10, 13, 24, 21, 4, 17, 12, 72, 13, 18};
		IntStream istream =  Arrays.stream(arr);
		// distinct removes the duplicates sorted : sorts the stream
		istream = istream.distinct().sorted();
		istream.forEach(System.out::println);
		
		istream =  Arrays.stream(arr);
		
		List<Integer> list= istream.boxed().collect(Collectors.toList());
		System.out.println(list);
		istream = Arrays.stream(arr);
		List<Integer> doubleval = istream.map((n)-> n*2).boxed().collect(Collectors.toList());
		System.out.println(doubleval);
		istream = Arrays.stream(arr);
		List<Integer> evennos = istream.filter((n)-> n%2==0).boxed().collect(Collectors.toList());
		System.out.println(evennos);
		istream = Arrays.stream(arr);
		long totalitems= istream.count();
		System.out.println(totalitems);
		istream = Arrays.stream(arr);
		OptionalInt min= istream.min();
		if (min.isPresent())
		System.out.println(min.getAsInt());
		istream = Arrays.stream(arr);
		OptionalInt max= istream.max();
		if (max.isPresent())
		System.out.println(max.getAsInt());
		istream = Arrays.stream(arr);
		OptionalDouble avg= istream.average();
		if (avg.isPresent())
		System.out.println(avg.getAsDouble());
		
		 // Reduce to find the product of all elements
        istream = Arrays.stream(arr);
        int product = istream.reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);
	}

}
