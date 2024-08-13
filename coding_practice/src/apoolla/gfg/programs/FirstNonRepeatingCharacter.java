package apoolla.gfg.programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		System.out.println(findChar("aditya"));
		System.out.println(findCharNormal("aditya"));
	}
	
	private static char findCharNormal(String input) {
		char[] charArray = input.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char ch : charArray) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return '\0';
	}

	private static char findChar(String str) {
		return str.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get().getKey();
	}
}
