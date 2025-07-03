package com.stringprograms;

import java.util.Arrays;

class ArraymoveZerosToStart {
	public static void main(String[] args) {
		int[] arr = { 0, 9, 8, 0, 3, 0, 6, 7 };
		int[] outPut = moveZerosToStart(arr);
		System.out.println("OutPut::: " + Arrays.toString(outPut));
	}

	public static int[] moveZerosToStart(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		int index = n - 1;
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				result[index--] = arr[i];
			}
		}
		return result;
	}
}