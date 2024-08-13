package java8project.javacode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

		List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

		list1.stream().filter(list2::contains).collect(Collectors.toList()).forEach(System.out::println);
		;
		
		findCommonElements(list1, list2).forEach(System.out::println);;
	}
	
	public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
		
		return list1.stream().filter(a -> list2.contains(a)).collect(Collectors.toList());
	}
}
