package java8project.devgenius;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Set<Integer> set = new HashSet<>();
		myList.stream().filter(i -> !set.add(i)).collect(Collectors.toList()).forEach(System.out::println);
		max();
	}
	
	public static void max() {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Optional<Integer> ans = myList.stream().max(Integer::compare);
		System.out.println(ans.get());
	}
}
