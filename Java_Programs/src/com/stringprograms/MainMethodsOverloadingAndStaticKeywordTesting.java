package com.stringprograms;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class MainMethodsOverloadingAndStaticKeywordTesting {

	public static void main(String[] args) {

		System.out.println("Main method call");
		testMethod();
		main("sanjeev1");
		main("sanjeev2", "sanjeev2");
	}

	//main method1 with single argument
	public static void main(String arg1) {
		System.out.println("main(String arg1)");
		String str = arg1;
		System.out.println(str);
	}

	//main method2 with double argument
	public static void main(String arg1, String arg2) {
		System.out.println("main(String arg1, String arg2)");
		String str1, str2;
		str1 = arg1;
		str2 = arg2;
		System.out.println(str1 + " " + str2);
	}
	
	//Static method
	public static void testMethod() {
		System.out.println("Static method call");
	}

}
