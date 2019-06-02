package com.suma.practice.general;


import java.util.*;
import java.io.*;
import java.net.*;

public class Anagrams
{
	public static void main(String[] args) throws IOException
	{
	/*	URL url = new URL("http://andrew.cmu.edu/course/15-121/dictionary.txt");
		Scanner sc = new Scanner( url.openStream() );

		HashMap<String, ArrayList<String>> map =  new HashMap<String, ArrayList<String>>();

		while( sc.hasNextLine() )
		{
			String word = sc.nextLine();
			String sortedWord = sortString(word); // this is a key

			ArrayList<String> anagrams = map.get( sortedWord );  //this is a value

			if( anagrams == null ) anagrams = new ArrayList<String>();

			anagrams.add(word);
			map.put(sortedWord, anagrams);
		}
		System.out.println(map.get(sortString("bread")));   //testing
*/
		System.out.println(isAnagram("anagram", "nagaram"));
	}
	
	
	 public static  boolean isAnagram(String s, String t) {
	        Map <String,Integer> map = new HashMap<String,Integer>();
	        s = s.trim().replaceAll("[^a-zA-Z0-9]","");
	        t = t.trim().replaceAll("[^a-zA-Z0-9]","");
	        if(s.length()!=t.length()){
	            return false;
	        }
	        int counter = 1;
	        for(int i =0; i < s.length(); i++){
	            if(map.get(String.valueOf(s.charAt(i)))!=null){
	                int count =  map.get(String.valueOf(s.charAt(i)));
	                count++;
	                map.put(String.valueOf(s.charAt(i)),count);
	            }else {
	                 map.put(String.valueOf(s.charAt(i)),1);
	            }
	            
	          
	        }
	        for(int j=0; j < t.length(); j++) {
	            if(map.get(String.valueOf(t.charAt(j)))==null){
	                return false;
	            }else {
	               int count = map.get(String.valueOf(t.charAt(j)));
	               count--;
	               if(count>=0){
	                   map.put(String.valueOf(t.charAt(j)),count);
	               } else {
	                   return false;
	               }
	               
	            }
	        }
	         return true;        
	    }
	 
	 
	private static String sortString( String w )
	{
		char[] ch = w.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}
}