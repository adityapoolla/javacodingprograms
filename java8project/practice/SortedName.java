package java8project.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedName {

	public static void main(String[] args) {
		String name = "aditya";
		List<Character> result = name.chars().mapToObj(i -> (char) i).sorted().collect(Collectors.toList());
		result.forEach(System.out::println);
		test();
	}

	public static List<Integer> multipliedBy10() {
		return List.of(1, 2, 3, 4).stream().filter(i -> i % 2 == 0).map(i -> i * 10).collect(Collectors.toList());
	}

	public static void test() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		map.put(10, "ten");
		map.put(11, "two");

		Map<Integer, String> output = null;

		Map<Integer, String> result = map.entrySet().stream().sorted((a, b) -> a.getValue().compareTo(b.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> y, LinkedHashMap::new));

		result.entrySet().forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));

		Map<String, Integer> result2 = map.entrySet().stream().sorted((a, b) -> a.getValue().compareTo(b.getValue()))
				.collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey, (x, y) -> x, LinkedHashMap::new));

		result2.entrySet().forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));
		
		
		Map<String, Integer> result3 = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey, (x, y) -> x, LinkedHashMap::new));

		result3.entrySet().forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));

	}

}
