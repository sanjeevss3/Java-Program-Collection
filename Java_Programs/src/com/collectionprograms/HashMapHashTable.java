package com.collectionprograms;

import java.io.*;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;


public class HashMapHashTable {
	
	 public static void main(String args[])
	    {
	        
	        //----------------hashmap--------------------------------
	        HashMap<Integer,String> hm=new HashMap<Integer,String>();
	        hm.put(100,"Amit");
	        hm.put(104,"Amit"); 
	        hm.put(101,"Vijay");
	        hm.put(102,"Rahul");
	        System.out.println("-----------Hash map-----------");
	        for (Entry<Integer, String> m:hm.entrySet()) {
	            System.out.println(m.getKey()+" "+m.getValue());
	        }
	        
	      //----------hashtable -------------------------
	        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
	        ht.put(101,"ajay");
	        ht.put(101,"Vijay");
	        ht.put(102,"Ravi");
	        ht.put(103,"Rahul");
	        System.out.println("-------------Hash table--------------");
	        for (Entry<Integer, String> m:ht.entrySet()) {
	            System.out.println(m.getKey()+" "+m.getValue());
	        }
	    }

}