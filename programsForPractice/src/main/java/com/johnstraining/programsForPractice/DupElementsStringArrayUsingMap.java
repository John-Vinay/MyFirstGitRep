package com.johnstraining.programsForPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DupElementsStringArrayUsingMap {
	 public static void main(String[] args) {
		
	
	 String str[] = {"yogi", "John", "John", "yogi", "yogi", "yogi", "raju", "raju", "John", "yogi"};
     //map=new HashMap<Strig,Integer>();
	 
	 Map<String, Integer> map = new HashMap<String, Integer>();
     for (String s : str) {
         if (map.containsKey(s)) {
             map.put(s, map.get(s) + 1);
         } else {
             map.put(s, 1);;
         }
     }
     for (Entry<String, Integer> e : map.entrySet()) {
         System.out.println(e.getKey() + "---" + e.getValue());

     }
	 }
}
