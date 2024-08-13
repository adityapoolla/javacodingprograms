package apoolla.gfg.programs;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(removeDuplicates(new int[] {2, 2, 3, 3, 4, 5})));
	}
	
	public static Integer[] removeDuplicates(int[] elements) {
		Set<Integer> set = new LinkedHashSet<>();
		for(int i : elements) {
			set.add(i);
		}
		return set.toArray(new Integer[0]);
	}
}
