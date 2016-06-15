/**
 * 
 */
package com.suma.practice.general;

import java.util.Scanner;

/**
 * @author sumandutta
 *
 */
public class ReverseNumber1 {

	
	public static void reverseWords(char[] s) {
	    int i=0;
	    for(int j=0; j<s.length; j++){
	        if(s[j]==' '){
	            reverse(s, i, j-1);        
	            i=j+1;
	        }
	    }
	 
	  s =   reverse(s, i, s.length-1);
	    System.out.println("s = "+ s.toString());
	    reverse(s, 0, s.length-1);
	}
	 
	public static char[] reverse(char[] s, int i, int j){
	    while(i<j){
	        char temp = s[i];
	        s[i]=s[j];
	        s[j]=temp;
	        i++;
	        j--;
	    }
	    return s;
	}
	/**
	 * @param args
	 */
	public static void main(String args[])
	   {
//	      int num=0;
//	      int reversenum =0;
//	      System.out.println("Input your number and press enter: ");
//	      //This statement will capture the user input
//	      Scanner in = new Scanner(System.in);
//	      //Captured input would be stored in number num
//	      num = in.nextInt();
//	      /* for loop: No initialization part as num is already
//	       * initialized and no increment/decrement part as logic
//	       * num = num/10 already decrements the value of num
//	       */
//	      for( ;num != 0; )
//	      {
//	          reversenum = reversenum * 10;
//	 //         System.out.println("num%10 = "+ num%10);
//	          reversenum = reversenum + num%10;
//	  //        System.out.println("num/10 ="+ num/10);
//	  //        System.out.println("reversenum = " + reversenum);
//	          num = num/10;
//	      }
//
//	      System.out.println("Reverse of specified number is: "+reversenum);
		String temp = "the sky is blue";
		reverseWords(temp.toCharArray());
		System.out.println("Temp = "+ temp);
	   }

}
