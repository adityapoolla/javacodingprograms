package java8project.javacode;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharsInString {

	public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        Set<Integer> set = new HashSet<>();
        inputString.chars().filter(i-> !set.add(i)).forEach(i -> System.out.println((char)i));
        
        findDuplicateCharecters("Aditya gopala Lakshminarayana").forEach(System.out::print);
	}
	
	public static Set<Character> findDuplicateCharecters(String str) {
		String inputString = str.replaceAll("\\s", "").toLowerCase();
		Set<Integer> set = new HashSet<>();
		return inputString.chars().filter(i -> !set.add(i)).mapToObj(i -> (char)i).collect(Collectors.toSet());
	}
}
