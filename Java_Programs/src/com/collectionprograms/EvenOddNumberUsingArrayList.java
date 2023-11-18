package com.collectionprograms;

import java.util.ArrayList;
import java.util.Collections;

public class EvenOddNumberUsingArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> evenlist = new ArrayList<Integer>();
		ArrayList<Integer> oddlist = new ArrayList<Integer>();
		// ArrayList<Integer>evenlist = new ArrayList<Integer>();
		// ArrayList<Integer>oddlist = new ArrayList<Integer>();

		int numberInputList[] = { 1, 5, 2, 6, 4, 9, 7 };

		for (int i = 0; i < numberInputList.length; i++) {

			if (numberInputList[i] % 2 == 0) {
				evenlist.add(numberInputList[i]);
			} else {
				oddlist.add(numberInputList[i]);
			}
		}
		Collections.sort(evenlist);
		Collections.sort(oddlist);
		for (int even : evenlist) {
			System.out.print(even + " ");
		}
		System.out.print("\n");
		for (int odd : oddlist) {

			System.out.print(odd + " ");
		}
	}
}