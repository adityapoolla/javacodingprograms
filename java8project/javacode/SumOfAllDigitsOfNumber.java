package java8project.javacode;

import java.util.stream.Stream;

public class SumOfAllDigitsOfNumber {

	public static void main(String[] args) {
        int i = 15623;

        int result = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
        
        System.out.println(result);
        
	}
}
