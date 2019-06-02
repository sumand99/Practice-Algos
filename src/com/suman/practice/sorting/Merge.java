package com.suman.practice.sorting;

public class Merge {

	public Merge() {
		
	}

	
 public static void main(String a[]){
	 int[] arr1 = {1,2,3,4,9};
	 int[] arr2 = {2,5,6};
	 int[] resultArr = new int[arr1.length+arr2.length];
	 
	 
	int i=0,j=0,k=0;
	
	
	while(i<arr1.length && j<arr2.length){
		if(arr1[i] < arr2[j]){
			resultArr[k++] = arr1[i++];
		}else {
			resultArr[k++] = arr2[j++];
		}
	}
	
	while(i<arr1.length){
		resultArr[k++] = arr1[i++];
	}

	while(j<arr2.length){
		resultArr[k++] = arr2[j++];
	}
	
	
	for(int c=0;c<resultArr.length;c++) {
		System.out.print(" "+ resultArr[c]);
	}
	  
 }
	 
}
