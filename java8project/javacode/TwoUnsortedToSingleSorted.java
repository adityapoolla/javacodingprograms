package java8project.javacode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoUnsortedToSingleSorted {

	public static void main(String[] args) {
		int[] a = new int[] { 4, 2, 7, 1 };

		int[] b = new int[] { 8, 3, 9, 5 };

		int[] sortedMerged = IntStream.concat(IntStream.of(a), IntStream.of(b)).sorted().toArray();
		
		System.out.println(Arrays.toString(sortedMerged));
	}
}
