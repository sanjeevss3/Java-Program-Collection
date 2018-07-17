package com.javaprograms;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

class VariableMethodThis {
	int x;
	int y;

	public VariableMethodThis(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void display() {
		System.out.println("Value of X: " +x + "\n" + "Value of Y: "+y);
	}

}

class ThisKeywordTutorial {

	public static void main(String args[]) {
	VariableMethodThis obj = new VariableMethodThis (10, 20);
	obj.display();
	
	}

}
