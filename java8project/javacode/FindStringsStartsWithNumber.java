package java8project.javacode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringsStartsWithNumber {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

		listOfStrings.stream().filter(i -> {
			return 48 <= i.chars().findFirst().getAsInt() && 57 >= i.chars().findFirst().getAsInt();
		}).collect(Collectors.toList()).forEach(System.out::println);

		listOfStrings.stream().filter(i -> Character.isDigit(i.charAt(0))).forEach(System.out::println);
	}
}
