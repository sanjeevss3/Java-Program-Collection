/**
* Auther: Sanjeev Chaudhary
* Date: 17 Jul 2025
*/

/**
 * 
 */
package com.stringprograms;

import java.util.HashSet;

public class ArrayDuplicateElementUsingJavaCollection {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 6, 7, 5, 3 };
		HashSet<Integer> myset = new HashSet<>();
		for (int num : arr) {
			if (myset.contains(num)) {
				System.out.println(num + " is a duplicate element");
			} else {
				myset.add(num);
			}
		}
	}

}
