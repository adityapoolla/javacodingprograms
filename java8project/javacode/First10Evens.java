package java8project.javacode;

import java.util.stream.IntStream;

public class First10Evens {

	public static void main(String[] args) {
		IntStream.range(0, 10).map(i -> i * 2).forEach(System.out::println);
	}
}
