package week3.assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostDuplicateCh {

	public static void main(String[] args) {
		 /* input: abbab
		 * output: b
		 * 
		 * 
		 */
		
		/*
		 * Psuedocode
		 * 
		 * 1) Map -> HashMap 
		 * 2) String -> ch[] -> Get all the character -> occurance
		 * 3) Keep comparing the occurance with other values -> max value -> character
		 * 
		 */
		String str = "abbab";
		char[] ch1 = str.toCharArray();
		int chCount = 0 ;
		char ch = 'a';
		Map<Character , Integer> map1 = new HashMap<Character , Integer>();
		
		for (int i=0 ; i<ch1.length ; i++) {
			map1.put(ch1[i], map1.getOrDefault(ch1[i], 0)+1);			
		}
		System.out.println(map1);
		for (Entry <Character,Integer> entry : map1.entrySet()) {
			if (chCount < entry.getValue()) {
			chCount = entry.getValue();
			 ch = entry.getKey();
			}
		}System.out.println(ch);

	}

}
