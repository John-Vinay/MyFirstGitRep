package com.johnstraining.programsForPractice;

public class ExtractNumFromStringAndSum
{
	public static void main(String[] args) {
		String str = "$##$@#$!!! latin string 1234";
		str = str.replaceAll("[^0-9]"," ");
		String trimVal = str.trim();
		System.out.println(trimVal);
		int num = Integer.parseInt(trimVal);
		int sum = 0;
		int digit = 0;
		while (num>0){
		    digit = num%10;
		    sum = sum+digit;
		    num = num/10;
		}
		System.out.println(sum);
	}
	
}