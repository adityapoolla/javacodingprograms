package java8project.leetcode;

import java.util.stream.Stream;

public class Soultion2678 {

	public static void main(String[] args) {
		String[] names = new String[10];

		Stream.of(names).map(i -> i.substring(11, 13))
		.mapToInt(Integer::parseInt)
		.filter(i -> i > 60)
		.count();
	}
}
