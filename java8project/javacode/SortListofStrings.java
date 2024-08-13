package java8project.javacode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListofStrings {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

		listOfStrings.stream().sorted((a, b) -> {
			if (a.length() > b.length())
				return 1;
			else if (a.length() < b.length())
				return -1;
			return 0;
		}).collect(Collectors.toList()).forEach(System.out::println);
	}
}
