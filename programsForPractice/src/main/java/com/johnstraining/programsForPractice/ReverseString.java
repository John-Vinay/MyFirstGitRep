package com.johnstraining.programsForPractice;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String str = "World";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		System.out.println("=======String Buffer========");
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}
