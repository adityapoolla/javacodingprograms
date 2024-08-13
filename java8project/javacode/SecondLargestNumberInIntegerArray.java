package java8project.javacode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumberInIntegerArray {

	public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//        Optional<Integer> result = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(2).sorted().findFirst();
        Optional<Integer> result = listOfIntegers.stream().sorted(Comparator.reverseOrder())
        		.skip(1).findFirst();
        System.out.println(result.get());
	}
}
