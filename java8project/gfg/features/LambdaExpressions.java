package java8project.gfg.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressions {

	public static void main(String[] args) {
		FunctionalInterface a = () -> {System.out.println("Aditya");};
		a.printMethod();
		
		List<Integer> l = List.of(1, 2, 3);
		l.forEach((i) -> {System.out.println();});
		isStringOnlyAlphabet("adiy");
		
	}
	
	public static boolean isStringOnlyAlphabet(String str) {
		Stream.of(Arrays.asList(str.split(""))).forEach(System.out::println);
		
		return true;
	}
	
}

interface FunctionalInterface {
	void printMethod();
}