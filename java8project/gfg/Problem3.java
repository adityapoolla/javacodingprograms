package java8project.gfg;

import java.util.Arrays;
import java.util.stream.IntStream;

// Program to convert Primitive Array to Stream in Java
// https://www.geeksforgeeks.org/program-to-convert-primitive-array-to-stream-in-java/?ref=lbp

public class Problem3 {
	
	// Generic function to convert  
    // an Array to Stream 
    public static IntStream  
                convertArrayToStream(int array[]) 
    { 
  
    	//1. using arrays.stream
    	//2. using IntStream
    	IntStream intStream1 = IntStream.of(array);
        // Return the converted Stream 
        return Arrays.stream(array); 
    } 
  
    public static void main(String args[]) 
    { 
        // Create an Array 	
        int[] array = new int[] { 3, 2, 5, 4, 1 }; 
  
        // Print the Array 
        System.out.println("Array: " 
                    + Arrays.toString(array)); 
  
        // convert the Array to Stream 
        IntStream stream = convertArrayToStream(array); 
  
        // Print the Stream 
        System.out.println("Stream: " 
                    + Arrays.toString(stream.toArray())); 
    } 

}
