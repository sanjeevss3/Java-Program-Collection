/**
* Auther: Sanjeev Chaudhary
* Date: 7 Aug 2025
*/

package com.stringprograms;

public class ArrayConsecutiveNumberCount {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 25, 6, 7, 8, 9, 10, 2, 3, 10 };
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] == arr[i] + 1) {
				count++;
			}
		}
		System.out.println("Consecutive number counts are: " + count);
	}
}
