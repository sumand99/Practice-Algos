/**
 * 
 */
package com.suman.practice.sorting;

import java.util.Arrays;

/**
 * @author sumandutta
 *
 */
public class QuickSort {

    private int array[];
    private int length;

	 public static void printArray(int[] B) {
	        System.out.println(Arrays.toString(B));
	    }
	 
	    public static void populateArray(int[] B) {
	        for (int i = 0; i < B.length; i++) {
	            B[i] = (int) (Math.random() * 100);
	        }
	    }

	    public void sort(int[] inputArr) {
	         
	        if (inputArr == null || inputArr.length == 0) {
	            return;
	        }
	        this.array = inputArr;
	        length = inputArr.length;
	        quickSort(0, length - 1);
	    }

	    private void quickSort(int lowerIndex, int higherIndex) {
	         
	        int i = lowerIndex;
	        int j = higherIndex;
	        // calculate pivot number, I am taking pivot as middle index number
	        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
	        // Divide into two arrays
	        while (i <= j) {
	            /**
	             * In each iteration, we will identify a number from left side which 
	             * is greater then the pivot value, and also we will identify a number 
	             * from right side which is less then the pivot value. Once the search 
	             * is done, then we exchange both numbers.
	             */
	            while (array[i] < pivot) {
	                i++;
	            }
	            while (array[j] > pivot) {
	                j--;
	            }
	            if (i <= j) {
	                exchangeNumbers(i, j);
	                //move index to next position on both sides
	                i++;
	                j--;
	            }
	        }
	        // call quickSort() method recursively
	        if (lowerIndex < j)
	            quickSort(lowerIndex, j);
	        if (i < higherIndex)
	            quickSort(i, higherIndex);
	    }
	    
	    private void exchangeNumbers(int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
        int A[] = new int[10];
        populateArray(A);
        System.out.println("Before Sorting: ");
        printArray(A);
        // sort the array
        quickSort.sort(A);
        System.out.println("\nAfter Sorting: ");
       printArray(A);
    }

}
