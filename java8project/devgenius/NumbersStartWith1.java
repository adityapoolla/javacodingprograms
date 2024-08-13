package java8project.devgenius;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartWith1 {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		myList.stream().filter(i -> {
			while (i >= 10) {
				i = i / 10;
			}
			return i == 1;
		}).collect(Collectors.toList()).forEach(System.out::println);
		;
	}
}
