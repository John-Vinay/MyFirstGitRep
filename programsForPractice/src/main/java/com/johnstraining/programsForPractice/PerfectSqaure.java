package com.johnstraining.programsForPractice;

import java.util.Scanner;

public class PerfectSqaure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, r, s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		num = sc.nextInt();
		r = (int) Math.sqrt(num);
		s = r * r;
		if (s == num) {
			System.out.println("Given Number is Perfect Square");
		} else {
			System.out.println("Given Number is Not a Perfect Square");
		}

	}
}
