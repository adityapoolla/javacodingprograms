package java8project.gfg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Program to convert Boxed Array to Stream in Java

public class Problem2 {

	// Generic function to convert  
    // an Array to Stream 
    public static <T> Stream<T>  
                convertArrayToStream(T array[]) 
    { 
  
    	// using Stream.of method
    	Stream<T> stream = Stream.of(array);
    	
    	// array -> List -> stream using list.stream();
    	Stream<T> stream2 = List.of(array).stream();
    	
        // Return the converted Stream 
        return Arrays.stream(array);
    } 
  
    public static void main(String args[]) 
    { 
        // Create an Array 
        String array[] = { "Geeks", "forGeeks",  
                                    "A Computer Portal" }; 
  
        // Print the Array 
        System.out.println("Array: "
                                + Arrays.toString(array)); 
  
        // convert the Array to Stream 
        Stream<String> 
            stream = convertArrayToStream(array); 
  
        // Print the Stream 
        System.out.println("Stream: " 
                    + Arrays.toString(stream.toArray())); 
    } 
}
