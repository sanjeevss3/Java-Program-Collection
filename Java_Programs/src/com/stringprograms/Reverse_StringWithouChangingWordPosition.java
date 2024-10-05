package com.stringprograms;

/**
 *
 * @author Sanjeev Chaudhary 
 * https://github.com/sanjeevss3/
 * April-27th-2024
 *
 */

public class Reverse_StringWithouChangingWordPosition {

	public static void main(String[] args) {

		String[] str = "Welcome to Automation Testing".split(" ");
		//String arr[] = str.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			for (int j = str[i].length() - 1; j >= 0; j--) {
				System.out.print(str[i].charAt(j));
			}
		System.out.print(" ");
		}
	}
}
