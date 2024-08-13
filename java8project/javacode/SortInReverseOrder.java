package java8project.javacode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortInReverseOrder {

	public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        decimalList.stream().sorted((a, b) -> a > b ? -1 : 1).collect(Collectors.toList())
        .forEach(System.out::println);
        
        decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
        .forEach(System.out::println);
	}
}
