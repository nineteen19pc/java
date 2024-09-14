package day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStream {
	public static void main(String[] args) {
		String[] color = { "Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet" };
		List<String> ilist = Arrays.asList(color);

		Stream<String> stream = ilist.stream();
		stream.map(String::toUpperCase).forEach(System.out::println);

		stream = ilist.stream();
		stream.map(String::toLowerCase).forEach(System.out::println);

		stream = ilist.stream();
		List<String> upper = stream.map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upper);

		stream = ilist.stream();
		List<String> lower = stream.map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(lower);

		stream = ilist.stream();
		List<String> before_m = stream.filter((c) -> c.compareToIgnoreCase("m") < 0).sorted()
				.collect(Collectors.toList());
		System.out.println(before_m);

		stream = ilist.stream();
		List<String> lowerlist = stream.filter((c) -> c.codePointAt(0) < 97)
				.sorted(String.CASE_INSENSITIVE_ORDER)
				.collect(Collectors.toList());
		System.out.println(lowerlist);

		stream = ilist.stream();
		List<String> upperlist = stream.filter((c) -> c.codePointAt(0) >= 97)
				.sorted(String.CASE_INSENSITIVE_ORDER)
				.collect(Collectors.toList());
		System.out.println(upperlist);
	}

}