package com.stringprograms;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */
class MyException extends Exception {
	public MyException(String str) {
		super(str);
	}

}

public class Zzzzz {
	public static void main(String args[]) {
		try {
			throw new MyException("MyException Called");
		} catch (MyException ex) {
			System.out.println("MyException caught");
			System.out.print(ex.getMessage());
		}
	}
}