package com.javaprograms;

import java.util.Arrays;
import java.util.Scanner;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class SortArrayElement {

	public static void main(String[] args) {
	/*	int tempVar, num;
		String numbersString;
		int[] numbers = {4, 11, 13, 12, 17, 35, 15, 7, 19, 3, 45};

		for (int i = 0; i < numbers.length; i++) {
		    for (int j = i; j < numbers.length; j++) {
		        if (numbers[i] < numbers[j]) {
		            tempVar = numbers[i];
		            numbers[i] = numbers[j];
		            numbers[j] = tempVar;
		        }
		    }
		}

		numbersString = Arrays.toString(numbers);

		System.out.println(numbersString); */
		
	/*	int n, temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		} */
		
		int[] arr= {9,4,8,5,10,3,11,7,1};
		int temp;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Ascending Order:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		//System.out.print(arr[n - 1]);

	}

}
