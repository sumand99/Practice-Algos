/**
 * 
 */
package com.suma.practice.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sumandutta
 *
 */
class FibonacciSeries{  
	 static int n1=0,n2=1,n3=0;    
	 static void printFibonacci(int count){    
	    if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(count-1);    
	     }    
	 }    
	 
	 
	 public static int fib(int n) {

		 //0,1,1,2,3,5,8
		 List <Integer> list = new ArrayList<Integer>();
		 list.add(0);
		 
		 int a = 1;  
		 int s=0;
		 int b = 0;
		 int counter = 0;
		 while(counter<=n){
		     s = a + b ;// 1=1,0  - 2=1,1 -  
		     a = b ;  // 1,1 - 2,2
		     b = s;
		     counter++;
		   list.add(s);
		 }
		 
		 return list.get(n);

		}
	 
	 public static void main(String args[]){    
		  int count=5;    
		  System.out.print(n1+" "+n2);//printing 0 and 1    
		  printFibonacci(count-2);//n-2 because 2 numbers are already printed  
		 System.out.println(fib(10));
	 }  
	}  