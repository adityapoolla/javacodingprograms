package java8project.javacode;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class FirstRepeatedCharacterInString {

	public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

        Set<String> str = new HashSet<>();
        Optional<String> result = Stream.of(inputString.split("")).filter(i -> !str.add(i)).findFirst();
        System.out.println(result.get());
	}
}
