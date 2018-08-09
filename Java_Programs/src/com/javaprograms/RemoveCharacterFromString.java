package com.javaprograms;


/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class RemoveCharacterFromString {

	public static void main(String[] args) {
		
			String str = "abcabdDCBA123";

			System.out.println("String after Removing 'a' = "+str.replace("a", ""));
			
			System.out.println("String after Removing First 'ab' = "+str.replaceFirst("ab", ""));

			System.out.println("String after replacing all small letters = "+str.replaceAll("([a-z])", ""));
			
			System.out.println("String after replacing all digits = "+str.replaceAll("([123])", ""));
		}

	}

