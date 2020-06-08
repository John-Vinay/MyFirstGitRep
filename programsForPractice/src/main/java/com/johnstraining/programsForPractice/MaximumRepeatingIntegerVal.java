package com.johnstraining.programsForPractice;

//Java program to find the most frequent element 
//in an array 
import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 

class MaximumRepeatingIntegerVal { 
	
	
	public static void main(String[] args) {
		
	
		int arr[] = {1, 0, 1, 0, 0, 0, 1, 1, 1} ;  
		
		// Insert all elements in hash 
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 
		
		for (Integer s : arr) {
	         if (map.containsKey(s)) {
	             map.put(s, map.get(s) + 1);
	         } else {
	             map.put(s, 1);;
	         }
	     } 
		
		// find max frequency. 
		int max_count = 0, res = 0; 
		
		for(Entry<Integer, Integer> e : map.entrySet()) 
		{ 
			if (max_count < e.getValue()) 
			{ 
				res = e.getKey(); 
				max_count = e.getValue(); 
			} 
		} 
		
		System.out.println("Most repeated Value is:"+res);
		System.out.println("Number of times Repeated:"+max_count);
		//System.out.println(max_count);
	}
}
		

