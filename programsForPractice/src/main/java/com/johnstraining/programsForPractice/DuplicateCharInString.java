package com.johnstraining.programsForPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "java";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();  
        char[] charArray = str.toCharArray();  
        for (Character ch : charArray) {  
            if (map.containsKey(ch)) {  
                map.put(ch, map.get(ch) + 1);  
            } else {  
                map.put(ch, 1);  
            }  
        }  
       /*Set<Character> keys = map.keySet();  
        for (Character ch : keys) {  
            if (map.get(ch) > 1) {  
                System.out.println(ch + "  is " + map.get(ch) + " times");  
                //return;
            }  */
        for (Entry<Character,Integer> e: map.entrySet()) {
        	if(e.getValue() > 1) {
        		
        		System.out.println(e.getKey());
        		
        	}
        	
        }
       	}

}
