package com.javaprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sanjeev Chaudhary 
 * https://github.com/sanjeevss3/
 *
 */

public class Count_Words {

	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.print("Enter any sentence : ");
		//String s = br.readLine();
		String s="Sanjeev Kumar Chaudhary";
		s = s + " ";
		int l = s.length();
		int c = 0;
		for (int i = 0; i < l; i++) {
			if (s.charAt(i) == ' ') {
				c++;
			}
			System.out.print("Number of words = " + c);
		}
		

	}

}
