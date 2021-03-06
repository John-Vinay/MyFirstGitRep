package com.johnstraining.programsForPractice;

//Java implementation 
import java.util.*;
import java.util.Map.Entry; 

class MaximumRepeatingStringValue { 

	public static void main(String[] args) {
		
	
	String str[] = { "geeks", "learn", "geeks", "learn", 
			"portal", "to", "learn", "learn", "learn", 
			"computer", "learn", "zoom", "learn", 
			"fire", "in", "be", "data", "geeks" }; 
	{ 

		// Create HashMap to store word and it's frequency 
		Map<String, Integer> map = new HashMap<String, Integer>(); 

		// Iterate through array of words 
		 for (String s : str) {
	         if (map.containsKey(s)) {
	             map.put(s, map.get(s) + 1);
	         } else {
	             map.put(s, 1);;
	         }
	     } 

		// Create set to iterate over HashMap 
		//Set<Entry<String, Integer> > set = hs.entrySet(); 
		String key = ""; 
		int value = 0; 

		for (Entry<String, Integer> e : map.entrySet()) { 
			// Check for word having highest frequency 
			if (e.getValue() > value) { 
				value = e.getValue(); 
				key = e.getKey(); 
			} 
		} 

		// Return word having highest frequency 
		//return key; 
		
		System.out.println(key);
		System.out.println(value);
	} 
	}

}	
