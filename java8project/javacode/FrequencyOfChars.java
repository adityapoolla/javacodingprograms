package java8project.javacode;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfChars {

	public static void main(String[] args) {
		String inputString = "java";
		Map<Character, Long> output = inputString.chars().sorted().mapToObj(c -> (char) c).peek(System.out::println)
				.collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
		System.out.println(output);
	}
}
