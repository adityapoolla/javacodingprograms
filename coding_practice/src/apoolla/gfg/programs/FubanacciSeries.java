package apoolla.gfg.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FubanacciSeries {

	public static void main(String[] args) {
//		printFirstN(3);
		printFirstNUsingJava8(10);
	}
	
	private static void printFirstNUsingJava8(int n) {
		Stream.iterate(new int[] {0, 1}, i -> new int[] {i[1], i[0] + i[1]}).limit(n)
		.map(i -> i[0]).forEach(System.out::println);
	}
	
	private static void printFirstN(int n) {
		List<Integer> fubanacciSeries = new ArrayList<>();
		if(n > 0) {
			fubanacciSeries.add(0);
		}
		if(n > 1) {
			fubanacciSeries.add(1);
		}
		for(int i = 2; i < n; i++) {
			Integer val = fubanacciSeries.get(i - 2) + fubanacciSeries.get(i - 1);
			fubanacciSeries.add(val);
		}
		fubanacciSeries.forEach(System.out::println);
	}
}
