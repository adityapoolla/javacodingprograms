package java8project.javacode;

import java.util.stream.IntStream;

public class PalindromeProgram {

	public static void main(String[] args) {
		String str = "ROTATOR";
		boolean isPalindrome
		= IntStream.range(0, str.length() / 2)
                .noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i -1));
		System.out.println(isPalindrome);
		
		boolean isItPalindrome 
		= IntStream.range(0, str.length()/2)
                .noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i -1));
          
        if (isItPalindrome)
        {
            System.out.println(str+" is a palindrome");
        }
        else
        {
            System.out.println(str+" is not a palindrome");
        }
	}
}
