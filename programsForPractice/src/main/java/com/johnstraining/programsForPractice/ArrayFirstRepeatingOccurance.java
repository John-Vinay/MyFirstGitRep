package com.johnstraining.programsForPractice;

public class ArrayFirstRepeatingOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 6, 4, };

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("First Repeating value is:" + arr[i]);
					return;
				}

			}
		}

	}

}
