package com.stringprograms;

import java.util.Arrays;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class ArrayElementSortigAndCompareOriginalArrayWithSortedArray {

	public static void main(String[] args) {
		int n, temp;

		// Take input from Keyboard
		/*
		 * Scanner s = new Scanner(System.in);
		 * System.out.print("Enter no. of elements you want in array:"); n =
		 * s.nextInt(); int a[] = new int[n]; //int b[] = {1,2,3,4,5}; //int
		 * arraySize=b.length; System.out.println("Enter all the elements:"); for (int i
		 * = 0; i < n; i++) { a[i] = s.nextInt(); }
		 */

		// No input from the Keyboard
		int arr[] = { 3, 4, 2, 5, 6, 9, 6 };
		// int a1[] = a; This won't help to copy the original array into the another

		int[] arr1 = Arrays.copyOf(arr, arr.length);

		n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Ascending Order:= ");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print(arr[n - 1]); // This code is used to do not print , at end.

		System.out.print("\n\nDecending Order:= ");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print(arr[n - 1]); // This code is used to do not print , at end.

		boolean result = Arrays.equals(arr, arr1);
		System.out.println("\n\nResult:::- " + result);
		if (result == true) {
			System.out.println("Given array and sorted array is same");
		} else {
			System.out.println("Given array and sorted array is NOT same");
		}

	}

}
