package com.stringprograms;

class MyException extends Exception {
	public MyException(String s) {
		// Call constructor of parent Exception
		super(s);
	}
}

public class CustomExceptionProgram {

	public static void main(String[] args) {
		{
			try {
				// Throw an object of user defined exception
				throw new MyException("GeeksGeeks");
			} catch (MyException ex) {
				System.out.println("Caught");

				// Print the message from MyException object
				System.out.println(ex.getMessage());
			}
		}
	}
}