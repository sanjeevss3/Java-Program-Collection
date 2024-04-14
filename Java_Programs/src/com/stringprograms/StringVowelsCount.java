package com.stringprograms;

import java.io.IOException;
import java.util.ArrayList;

public class StringVowelsCount {

	public static void main(String[] args)throws IOException
    {
        String str = "my name is sAnjeEv";
        //str = str.toLowerCase();
        int count = 0;
        String vow ="AEIOUaeiou";
        ArrayList<Character> vowels = new ArrayList<Character>();
        for(int i=0;i<vow.length();i++)
        {
            vowels.add(vow.charAt(i));
        }
        System.out.print("Vowels in given sentence are: ");
        for (int i = 0; i < str.length(); i++) {
            if(vowels.contains(str.charAt(i))){
                count++;
                System.out.print(str.charAt(i));
            }     
        }
        // display total count of vowels in string
        System.out.println("\nVowels count are: " + count);
    }
}