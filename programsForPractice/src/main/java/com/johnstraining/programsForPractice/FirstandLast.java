package com.johnstraining.programsForPractice;

import java.util.Arrays;

public class FirstandLast {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 782765;
		/*String StrNum = Integer.toString(number);
		//System.out.println(StrNum);
		String arr[] = StrNum.split("");		
		int Sum = Integer.parseInt(arr[0])+Integer.parseInt(arr[arr.length-1]);
		//System.out.println(Sum);*/
		
		int lastDigit = number%10;
		
		System.out.println(lastDigit);
		int FirstDigit = number;
		while (FirstDigit >= 10) {
			FirstDigit = FirstDigit/10;
		}
			System.out.println(FirstDigit);
			int total = FirstDigit+lastDigit;
			
			System.out.println(total);
			
			
		}

	}


