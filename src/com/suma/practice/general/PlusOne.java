package com.suma.practice.general;

public class PlusOne {

	public PlusOne() {
		// TODO Auto-generated constructor stub
	}

	 public int[] plusOne(int[] digits) {
	        int number=0;
	        int[] localdigits = new int[digits.length]; 
	        
	        for (int i= 0 ; i<digits.length; i++) {
	              int temp = 0;
	              temp = (int) Math.pow(10,(digits.length-1-i)) * digits[i]; //100, 20 , 3
	              number = number + temp ; //100, 120, 123
	            
	        }
	        number++;
	        
	        for (int i= 0 ; i<digits.length; i++) {
	              int value = 0;
	              int remainder = 0;
	              value = number / (int) (Math.pow(10,(digits.length-1-i))); //1, 2 , 3
	              number = number % (int) (Math.pow(10,(digits.length-1-i))) ;  //23,3
	              localdigits[i] = value;
	        }
	        return localdigits;
	    }
	 
	 public static int[] plusOne2(int[] digits) {
		 int len = digits.length;	 
		 for (int i = len - 1; i >= 0; i--) {
		 if (digits[i] == 9) {
			 digits[i] = 0;
		 } else {
			 digits[i] = digits[i] + 1;
			 break;
		 }

		 if (i == 0 && digits[i] == 0) {
			 int[] y = new int[len + 1];
			 y[0] = 1;
		 for (int j = 1; j <= len; j++) {
			 y[j] = digits[j - 1];
		 }
		 	digits = y;
		 }
		 }

		 return digits;
		 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myIntArray = new int[]{1,9,9};
		PlusOne obj = new PlusOne();
		obj.plusOne2(myIntArray);
		
	
	}

}
