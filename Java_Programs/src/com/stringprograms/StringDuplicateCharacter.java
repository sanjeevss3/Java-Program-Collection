package com.stringprograms;

public class StringDuplicateCharacter {

	public static void main(String[] args) {
		
		String str="automation";
		int count=0; 
		char[] ch=str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate character is: "+ch[i]);
					count++;
				}
			}
		}
		System.out.println("Duplicate characters count: "+count);
	}

}
