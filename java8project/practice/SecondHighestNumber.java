package java8project.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class SecondHighestNumber {

	public static void main(String[] args) {
		int[] elements = new int[] { 10, 90, 20, 80, 2, 9 };
		int result = secondHighestIntegerInArray(elements);
		System.out.println(result);

	}

	private static int secondHighestIntegerInArray(int[] elements) {
		Integer[] numbers = new Integer[] { 1, 2, 3 };
		List<Integer> list = Arrays.asList(numbers);
		Optional<Integer> element = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		return element.get();
	}
	
	private static int secondIntHighestIntegerInArray(int[] elements) {
		return IntStream.of(elements).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	}
}
