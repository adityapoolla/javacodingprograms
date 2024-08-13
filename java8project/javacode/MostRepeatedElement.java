package java8project.javacode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElement {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book",
				"Pencil");

		String result = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().sorted((i, j) -> {
					long o1 = i.getValue();
					long o2 = j.getValue();
					return o1 < o2 ? 1 : -1;
				}).findFirst().get().getKey();
		System.out.println(result);
		solution();
	}
	
	public static void solution() {
		List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book",
				"Pencil");
		String result = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
		System.out.println(result);
	}
}

