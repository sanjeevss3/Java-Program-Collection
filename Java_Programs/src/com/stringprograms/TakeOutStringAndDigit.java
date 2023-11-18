package com.stringprograms;

public class TakeOutStringAndDigit {
	public static String removeDigitsFromString(String str) {
		char[] charArray = str.toCharArray();
		String result = "";
		int sum = 0;

		for (int i = 0; i < charArray.length; i++) {
			if (!Character.isDigit(charArray[i])) {
				result = result + charArray[i];
			} else {
				sum = sum + charArray[i];
				System.out.println(sum);
			}
		}
		System.out.println("\n");
		for (int j = result.length() - 1; j >= 0; j--) {
			System.out.print(result.charAt(j));
		}
		System.out.println("\n");
		return result;

	}

	public static void main(String[] args) {
		String str = "sanjeev123";
		System.out.println(removeDigitsFromString(str));
	}
}
