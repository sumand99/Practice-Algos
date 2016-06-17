package com.suman.practice.datastructure;

public class PrintPyramid {

	public PrintPyramid() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		     for(int i=0;i<5;i++) {
		         for(int j=0;j<5-i;j++) {
		             System.out.print(" ");
		         }
		        for(int k=0;k<=i;k++) {
		            System.out.print("* ");
		        }
		        System.out.println();  
		    }
		     
//		     int arr[] = {2,3,7};
//		     System.out.println("Increment = "+ ++arr[2]);


	}

}
