package java8project.javacode;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddAndEven {

	public static void main(String[] args) {
		Map<Boolean, List<Integer>> oddeven = IntStream.range(0, 200)
				.mapToObj(i -> (Integer) i)
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));
		for(Entry<Boolean, List<Integer>> entry : oddeven.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
