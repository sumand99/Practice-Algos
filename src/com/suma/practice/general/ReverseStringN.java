package com.suma.practice.general;

import java.util.Arrays;

public class ReverseStringN {

	public void  reverseStringN(char arr[]) {
		int l = arr.length;
		int m =l/2;
		for(int i=0,j=m-1;i<m;i++,j--){
			swap(i,j,arr);
		}
	}
	
   private void swap(int i, int j, char [] arr ){
	   
	   char temp = arr[i];
	   arr[i] = arr[j];
	   arr[j] =temp;
   }

	public static void main(String[] args) {
		
//		char arr[] = {'S','U','M','A','N'};
//		new ReverseString().reverseString(arr);
//		System.out.print(Arrays.toString(arr));
		
	firstUniqChar("llveleetcode");
		

	}
	
	
	 public  static int firstUniqChar(String s) {
	        int m=0;
	        int [] data = new int[255];
	        
	        for(int i=0; i<s.length();i++){
	            int x = s.charAt(i);
	           if(data[x]>=1){
	               data[x]=2;
	           }else{
	               data[x]=1;
	           }
	        }
	        for(int i=0; i<s.length();i++){
	            int x = s.charAt(i);
	           if(data[x]==1){
	               m=i;
	               System.out.print(data[x]+"  "+i);
	               return i;
	               
	           }
	        }
	        
	        return m;
	       
	        
	        
	    }

}
