/**
 * 
 */
package com.suma.practice.general;

/**
 * @author sumandutta
 *
 */
public class Palindrome1 {

	
		public static boolean isValidPalindrome(String s){
			if(s==null||s.length()==0) return false;
	 
			s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
			System.out.println(s);
	 
			for(int i = 0; i < s.length() ; i++){
				char c = s.charAt(i);
				char c2= s.charAt(s.length() - 1 - i);
				if(c != c2){
					return false;
				}
			}
	 
			return true;
		}
	 
		public static void main(String[] args) {
			String str = "A man, a plan, a canal: Panama";
	 
			System.out.println(isValidPalindrome(str));
		}
	
}
