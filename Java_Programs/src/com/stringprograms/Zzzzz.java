package com.stringprograms;

import java.util.ArrayList;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

class Zzzzz {
	public static void main(String[] args) {

		ArrayList arr = new ArrayList<>();
		arr.add(1);
		arr.add("Sanjeev");
		arr.add(1.5);

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("Kumar");
		arr1.add("Chaudhary");

		for (int i = 0; i < arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}

	}

}