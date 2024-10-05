package com.stringprograms;

import java.util.Scanner;

/**
 *
 * @author Sanjeev Chaudhary 
 * https://github.com/sanjeevss3/
 *
 */

public class ArrayElementFirstAndSecondHighestNumber {

	public static void main(String[] args) {
		int n, temp;
		
		int[] a={10, 20, 20, 40, 5, 50}; 
		
		n=a.length;
        System.out.println("size: "+n);
         
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++ ){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        
        for(int i=n-1; i>=4; i--){ //i>=4 need to be update once you add or remove elements
            System.out.print(a[i]+" ");
        }
        
    }
}