package com.johnstraining.programsForPractice;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=87;
		int count = 0;
		while (number!=0) {
			number=number/10;
			count++;
		}
		
		
		System.out.println(count);

	}

}
