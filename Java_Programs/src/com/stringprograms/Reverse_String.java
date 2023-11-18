package com.stringprograms;

import java.util.Scanner;

/**
*
* @author Sanjeev Chaudhary
* https://github.com/sanjeevss3/
*
*/

public class Reverse_String {

	public static void main(String[] args) {

		String str = "Hello Java";
		// Below code is for to take input from user.
		//Scanner sc=new Scanner(System.in);  
		//System.out.println("Enter the string which you want to reverse");
		//String str=sc.next();

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		//sc.close();
	}
}