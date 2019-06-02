package com.suman.practice.datastructure;

public class MaximumSubarray {

	public MaximumSubarray() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static int maxSubArray(int[] A) {
		int max = A[0];
		int[] sum = new int[A.length];
		sum[0] = A[0];
 
		for (int i = 1; i < A.length; i++) {
			sum[i] = Math.max(A[i], sum[i - 1] + A[i]);
			max = Math.max(max, sum[i]);
			System.out.println("");
		}
 
		return max;
	}
	
	
	 public static int maxSubArray_2(int[] A) {
	       int newsum=A[0];
	       int max=A[0];
	       for(int i=1;i<A.length;i++){
	           newsum=Math.max(newsum+A[i],A[i]);
	           max= Math.max(max, newsum);
	       }
	       return max;
	    }
	
	public static void main(String args[]){
		
		int[] temp = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println("Max = "+ maxSubArray(temp));
		
		System.out.println("Max = "+ maxSubArray_2(temp));
	}

}
