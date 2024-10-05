package com.stringprograms;

import java.util.Arrays;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class ArrayElementSortigUsingPredefinedMethod {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 9, 6, 4, 1, 3 };

		// Normal copy arr1=arr does not work because post sorting both become same.
		int[] arr1 = Arrays.copyOf(arr, arr.length);

		// This method helps to sort the array elements.
		Arrays.sort(arr);

		System.out.println("\nOriginal Array List::::- ");
		for (int num1 : arr1) {
			System.out.print(num1 + " ");
		}

		System.out.println("\nSorted Array====- ");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		// This method helps to compare two arrays elements are same in sequence.
		boolean result = Arrays.equals(arr, arr1);
		System.out.println("\n\nResult---- " + result);

		if (result == true) {
			System.out.println("Given array and sorted array is same");
		} else {
			System.out.println("Given array and sorted array is NOT same");
		}
	}

}
