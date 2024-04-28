package com.stringprograms;

import java.util.Scanner;

/**
 *
 * @author Sanjeev Chaudhary 
 * https://github.com/sanjeevss3/
 * April-27th-2024
 *
 */

public class Reverse_StringWithouChangingWordPosition {

	public static void main(String[] args) {

		String str = "Welcome to Automation Testing";
		String arr[] = str.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				System.out.print(arr[i].charAt(j));
			}
		System.out.print(" ");
		}
	}
}
