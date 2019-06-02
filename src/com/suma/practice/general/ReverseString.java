package com.suma.practice.general;

public class ReverseString {

	public ReverseString() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void reverseString(char[] s) {
	     char[] strArr = new char[s.length];
	     int index = 0;
	     char c1 ,c2;
	     int i = 0;
	     for (int j=s.length-1;j>(s.length-1)/2;j--){
	    	  if(i<(s.length-1)/2){
		    	    c1= s[i];
		    	    c2=s[j];
		    	    s[i] = c2;
		    	    s[j] = c1;
		    	    i++;
 	    	  }
	     }
	        System.out.println(s);
	}
	
	public static void reverseString2(char[] s){
		char temp;
        
        for (int i = 0; i < s.length/2; i++) 
        {
            temp = s[i];
             
            s[i] = s[s.length-1-i];
             
            s[s.length-1-i] = temp;
        }
        
        System.out.println(s);
	}

	public static void main(String[] args) {
		char c[] = {'h','e','l','l','o'};
		reverseString2(c);

	}

}
