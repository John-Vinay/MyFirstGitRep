package com.johnstraining.programsForPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExampleSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hs = new HashSet<String>();
		//List<String> hs=new ArrayList<String>();
		
		hs.add("abcd");
		hs.add("abc");
		hs.add("xyz");
		hs.add("abcd");
		
		System.out.println(hs);
		

	}

}
