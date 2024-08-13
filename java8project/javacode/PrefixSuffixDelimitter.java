package java8project.javacode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixSuffixDelimitter {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		String result = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println(result);
	}
}
