package java8project.javacode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxAndMinofNumbers {

	public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Optional<Integer> max = listOfIntegers.stream().max(Comparator.naturalOrder());
        System.out.println(max.get());
        System.out.println(listOfIntegers.stream().min(Comparator.naturalOrder()).get());
	}
}
