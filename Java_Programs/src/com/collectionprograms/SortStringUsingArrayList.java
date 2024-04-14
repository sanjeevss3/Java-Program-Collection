package com.collectionprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class SortStringUsingArrayList {
	public static void main(String args[]) {
		ArrayList<String> arrlist=new ArrayList<String>();
		
		arrlist.add("US");
		arrlist.add("UK");
		arrlist.add("Asia");
		arrlist.add("India");
		arrlist.add("China");
		
		System.out.println("Numbers before sorting");
		for(String counter : arrlist) {
			System.out.println(counter);
		}
		
		Collections.sort(arrlist);
		
		System.out.println("\nNumbers after sorting");
		for(String counter : arrlist) {
			System.out.println(counter);
		}
		
		/* Sorting in decreasing order*/
		   Collections.sort(arrlist, Collections.reverseOrder());
		   
		   System.out.println("\nNumbers after sorting in Descending Order");
			for(String counter : arrlist) {
				System.out.println(counter);
			}
	}

}
