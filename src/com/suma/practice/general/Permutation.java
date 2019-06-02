/**
 * 
 */
package com.suma.practice.general;

import java.util.Random;

/**
 * @author sumandutta
 *
 */
public class Permutation {

	/**
	 * 
	 */
	public Permutation() {
		// TODO Auto-generated constructor stub
	}

	
	public static boolean permutation(String str1, String str2) {
	    if(str1 == str2) return true;
	    if(str1 == null || str2 == null || str1.length() != str2.length()) return false;
	    char[] arr = new char[256];
	    for(int i=0; i<str1.length(); i++){
	        arr[str1.charAt(i)]++;
	        arr[str2.charAt(i)]--;
	    }
	    for(int i=0; i<256; i++){
	        if(arr[i] != 0)
	            return false;
	    }
	    return true;
	}

	public static Boolean isIntPalindrome(int x) {            

		/*if(x<0)
			return false;
		if(x==0)
			return true;

		int rem = x;
		int quot = x;
		int rev = 0;
		int exp = 0;
		while(quot >= 1) {
			quot = quot /10;
			rem = rem % 10;
			rev = (int) (rev * 10 + rem);		     
			rem = quot;
		}

		if(x==rev){
			return true;
		} else {
			return false;
		}*/
		
		 if (x < 0) return false;
		    return new Random().nextBoolean();

	}
	
	public static boolean isStringPalindrome(String str){
	    
	    if(null==str || str.equals("")) 
	     return true;
	    int j=str.length()-1;
	    for(int i=0;i<str.length()/2;i++){
	       // for(; j>0;j--){
	            if(str.charAt(i)==str.charAt(j)){
	                j--;
	            }else {
	                return false;
	            }
	        
	    }
	  return true;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//System.out.println(permutation("GODK", "DOGG"));
System.out.println(isStringPalindrome("maaadaaam"));
	}

}
