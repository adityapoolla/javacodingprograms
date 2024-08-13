package java8project.gfg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

// Program to convert a Map to a Stream in Java


public class Problem1 {

	public static void main(String args[]) 
    { 
  
        // Create a Map 
        Map<Integer, String> map = new HashMap<>(); 
  
        // Add entries to the Map 
        map.put(1, "Geeks"); 
        map.put(2, "forGeeks"); 
        map.put(3, "A computer Portal"); 
  
        // Print the Map 
        System.out.println("Map: " + map); 
  
        // Convert the Map to Stream 
        Stream<Map.Entry<Integer, String> > stream =  
                                   convertMapToStream(map); 
  
        // Print the TreeMap 
        System.out.println("Stream: " 
                      + Arrays.toString(stream.toArray())); 
    }

	private static Stream<Entry<Integer, String>> convertMapToStream(Map<Integer, String> map) {
		
		// keys to stream
		map.keySet().stream();
		
		// values to stream
		map.values().stream();
		
		return map.entrySet().stream();
		
	} 
}
