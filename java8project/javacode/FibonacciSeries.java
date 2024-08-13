package java8project.javacode;

import java.util.stream.Stream;

public class FibonacciSeries {

	public static void main(String[] args) {
		Stream.iterate(new int[] { 0, 1 }, i -> new int[] { i[1], i[0] + i[1] })
		.limit(10)
		.map(i -> i[0])
		.forEach(System.out::println);
		
		printFubanacciSeries(10);
	}
	
	
	public static void printFubanacciSeries(int count) {
		Stream.iterate(new int[] {0, 1}, i -> new int[] { i[1], i[0] + i[1] })
		.limit(count)
		.map(i -> i[0])
		.forEach(System.out::println);
	}
}
