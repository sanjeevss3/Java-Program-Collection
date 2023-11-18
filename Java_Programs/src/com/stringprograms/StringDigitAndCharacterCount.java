package com.stringprograms;

public class StringDigitAndCharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "B#e12nga@luru";
		int digitCount = 0, characterCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				digitCount++;
			} else {
				characterCount++;
			}
		}
		System.out.println("Digit count in given string are=" + digitCount);
		System.out.println("Character count in given string are=" + characterCount);
	}

}
