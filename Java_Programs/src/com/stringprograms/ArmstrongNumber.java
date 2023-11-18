package com.stringprograms;

import java.util.Scanner;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class ArmstrongNumber {

	public static void main(String[] args) {

	/*	 int number = 1634, originalNumber, remainder, result = 0, n = 0;
	        originalNumber = number;
	        for (;originalNumber != 0; originalNumber /= 10, ++n);
	        System.out.println("Digits:::::::"+n);
	        originalNumber = number;
	        for (;originalNumber != 0; originalNumber /= 10)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, n);
	        }
	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	            */
		
		int num=152, temp, rem, sum=0;
		temp=num;
		while(num>0) {
			rem= num%10;
			//sum=sum+rem*rem*rem;
			sum=(int) (sum+Math.pow(rem, 3));
			num=num/10;
		}
		if(sum==temp) {
		System.out.println("Number is Armstrong: "+temp);
		}else {
			System.out.println("Number is NOT Armstrong: "+temp);
		}
	}
	

}
