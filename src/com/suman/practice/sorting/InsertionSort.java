package com.suman.practice.sorting;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
        int A[] = new int[10];
        populateArray(A);
        System.out.println("Before Sorting: ");
        printArray(A);
        // sort the array
        insertionSort(A);
        System.out.println("\nAfter Sorting: ");
       printArray(A);
    }

	 public static void printArray(int[] B) {
	        System.out.println(Arrays.toString(B));
	    }
	 
	    public static void populateArray(int[] B) {
	        for (int i = 0; i < B.length; i++) {
	            B[i] = (int) (Math.random() * 100);
	        }
	    }
	    
	  public static void insertionSort(int[] B){
		  int temp;
		  for(int i=1;i<B.length;i++){
			  for(int j=i;j>0;j--){
				  if(B[j]<B[j-1]){
					  temp = B[j-1];
					  B[j-1] = B[j];
					  B[j] = temp;
				  }
			  }
		  }
	  }
}
