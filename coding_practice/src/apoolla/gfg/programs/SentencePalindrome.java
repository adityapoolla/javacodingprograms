package apoolla.gfg.programs;

import java.util.stream.Stream;

public class SentencePalindrome {

	public static void main(String[] args) {
		
		isPalindrome("ata ataa");
		isPalindromeStreams("a is not b");
	}
	
	public static void isPalindromeStreams(String sentence) {
		char[] chars = sentence.toCharArray();
		Stream.of(chars).forEach(System.out::println);
	}
	
	public static void isPalindrome(String sentence) {
		char[] charArray = sentence.toLowerCase().toCharArray();
		int i = 0; 
		int j = charArray.length - 1;
		while(i != j) {
			if(charArray[i] == '\s') {
				i++;
				continue;
			}
			if(charArray[j] == '\s') {
				j--;
				continue;
			}
			if(charArray[i] != charArray[j]) {
				System.out.println("Sentence is not palindrome");
				break;
			}
			i++;
			j--;
		}
		if(i == j) {
			System.out.println("Sentence is palindrome");
		}
	}
}
