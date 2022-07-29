package week3.assignments;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class NumberOccurances {

	public static void main(String[] args) {
		/*
		 * Input array numbers, each occurances
		 * 
		 * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
		 * output: 2 -> 3 , 3 -> 2, 4 -> 1 
		 * 
		 * Order: Ascending Order
		 * 
		 */
		
		/*
		 * Psuedcode:
		 * 
		 * 1) Create Map -> TreeMap
		 * 2) For loop -> each number -> add to the map
		 * 3) If it is exist -> update it with + 1
		 * 	  Else -> new entry with 1 as value
		 * 
		 */
		
		int[] arr1 = {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		Map<Integer , Integer> map1 = new TreeMap<Integer , Integer>();
		
		for (int i = 0; i < arr1.length ; i++) {			
				map1.put(arr1[i], map1.getOrDefault(arr1[i], 0)+1);			
		}
		
		System.out.println(map1);	

	}

}
