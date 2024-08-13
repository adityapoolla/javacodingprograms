package java8project.javacode;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumAndAverage {

	public static void main(String[] args) {
		
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};

        System.out.println(IntStream.of(a).sum());
        
        System.out.println(IntStream.of(a).average().getAsDouble());
	}
}
