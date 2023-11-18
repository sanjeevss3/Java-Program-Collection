package com.stringprograms;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class Zzzzz {
		
		    public String solution(int AA, int AB, int BB) {
		        // Implement your solution here
		        String largestString= Integer.toString(BB+AB+AA);
		        System.out.println("Largest string: "+largestString);
				return largestString;	
		    }	
}

class Solution{
public static void main(String args[]) {
	Zzzzz obj=new Zzzzz();
	obj.solution(1, 9, 1);
	

    }
}
