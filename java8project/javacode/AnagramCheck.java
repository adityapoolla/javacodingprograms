package java8project.javacode;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramCheck {

	public static void main(String[] args) {
//		String s1 = "RaceCar";
//		String s2 = "CarRace";
//
//		boolean isanagram = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining()) == Stream
//				.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
//		System.out.println(isanagram);
		
		String s1 = "RaceCar";
        String s2 = "CarRace";
         
        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
         
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
         
        if (s1.equals(s2)) 
        {
            System.out.println("Two strings are anagrams");
        }
        else
        {
            System.out.println("Two strings are not anagrams");
        }
        System.out.println(testAnagram(s1, s2));
	}
	
	
	public static boolean testAnagram(String s1, String s2) {
		
		String str1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		String str2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		return str1.equals(str2);
	}
}
