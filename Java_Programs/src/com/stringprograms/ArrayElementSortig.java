package com.stringprograms;

import java.util.Scanner;

/**
 *
 * @author Sanjeev Chaudhary 
 * https://github.com/sanjeevss3/
 *
 */

public class ArrayElementSortig {

	public static void main(String[] args) {
		int n, temp;
		
		//Take input from Keyboard
	/*	Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		n = s.nextInt();
		int a[] = new int[n];
		//int b[] = {1,2,3,4,5};
		//int arraySize=b.length;
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		} */
		
		//No input from the Keyboard
		int a[]= {3,4,2,5,6,9,6};
		n=a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Ascending Order:");
		for (int i = 0; i < n-1; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.print(a[n - 1]); //This code is used to do not print , at end.

	}

}
