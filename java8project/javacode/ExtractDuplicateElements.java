package java8project.javacode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractDuplicateElements {

	public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);

        Set<Integer> uniqueElements = new HashSet<>();
        
        listOfIntegers.stream().filter(i -> !uniqueElements.add(i)).collect(Collectors.toList())
        .forEach(System.out::println);;
 	}
}
