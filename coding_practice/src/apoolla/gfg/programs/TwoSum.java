package apoolla.gfg.programs;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] {1, 9, 8, 2}, 10)));
		
	}
	
	public static int[] twoSum(int[] elements, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < elements.length; i++) {
			if(map.containsKey(elements[i])) {
				return new int[] {map.get(elements[i]), i};
			}
			int diff = target - elements[i];
			map.put(diff, i);
		}
		return new int[] {-1, -1};
	}
}
