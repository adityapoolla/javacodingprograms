package java8project.javacode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class UnsortedToSortedWithoutDuplicates {

	public static void main(String[] args) {
		int[] a = new int[] { 4, 2, 5, 1 };

		int[] b = new int[] { 8, 1, 9, 5 };

		int[] c = IntStream.concat(IntStream.of(a), IntStream.of(b)).distinct().sorted().toArray();
		
		System.out.println(Arrays.toString(c));
	}
}
