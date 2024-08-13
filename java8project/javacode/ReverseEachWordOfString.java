package java8project.javacode;

import java.util.stream.Stream;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		
		String str = "Java Concept Of The Day";

		Stream.of(str.split(" ")).map(i -> new StringBuffer(i).reverse()).forEach(System.out::println);
	}
	
	public static void reverseSentence() {
		
		String str = "Java Concept Of The Day";


		
	}
}

