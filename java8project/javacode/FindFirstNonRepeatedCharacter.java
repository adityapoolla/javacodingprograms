package java8project.javacode;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

		Map<Character, Long> map = inputString.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		System.out.println(map.entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get().getKey());
		test();
	}

	public static void test() {
		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

		Stream<Object> charStream = inputString.chars().mapToObj(i -> (char) i);
		Stream<Character> source = Stream.of('a', 'd', 'i', 'a');
		// source.filter(i -> Collections.frequency(null, source))

		List<String> names = Arrays.asList("siva", "ram", "aditya", "ram", "aditya", "ram");

//		String repeatedName = names.stream().filter(e -> (Collections.frequency(names, e) > 1))s.findFirst().get();
//		System.out.println(repeatedName);
	}
	
	public static void findFirstNonRepeatedChar(String input) {
		// This is aditya
		// first non repeating char is h
		
	}
}
