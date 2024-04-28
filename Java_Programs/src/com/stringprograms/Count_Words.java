package com.stringprograms;

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
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.print("Number of words = " + count);

	//======================================2nd method=========================================	
		System.out.print("\n");
		String[] str="Delhi, Mumbai, Bettiah Bangalore Mangalore".split(" ");
	    int count1=0; 
	       for(int i=0; i<str.length;i++){
	           count1++;
	       }
	       System.out.print("Number of words = " + count1);
	}

}
