package com.suman.practice.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertHashSettoTreeSet {

	public ConvertHashSettoTreeSet() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String...a){
		HashSet<String> hset = new HashSet<String>();
		
		 hset.add("Element1");
	     hset.add("Element2");
	     hset.add("Element3");
	     hset.add("Element4");
	     
	     
	     System.out.println("Hset Contain = " + hset);
	     
	     Set<String> tSet = new TreeSet<String>(hset);
	     
	     System.out.println("TreeSet contains: ");
	     for(String temp : tSet){
	        System.out.println(temp);
	     }
	     
	}

}
