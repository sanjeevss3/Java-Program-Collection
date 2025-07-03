package com.stringprograms;

public class StringOnlyCharacterNotSpecialCharacter {

	public static void main(String[] args) {
		String input = "a@b #c% d*e";
		char[] arr = input.toCharArray();
		int left = 0, right = arr.length - 1;

		while (left < right) {
			if (!Character.isLetter(arr[left])) {
				left++;
			} else if (!Character.isLetter(arr[right])) {
				right--;
			} else {
				// Swap the characters
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}

		String output = new String(arr);
		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
	}
}
