package com.suma.practice.general;

public class MoveZeros {

	public MoveZeros() {
		// TODO Auto-generated constructor stub
	}

	 public static void moveZeroes(int[] nums) {
//	        int temp;
//	        for(int i=0;i<nums.length;i++){
//	            if(nums[i]==0 && nums[i+1]>0) {
//	                temp = nums[i];
//	                nums[i] = nums[i+1];
//	                nums[i+1] = temp; 
//	            }
//	        }
//	        
	        
	        int i = 0;
	        for (int j = 1; j < nums.length; j++) {
	            if (nums[i] == 0 && nums[j] != 0) {
	                swap(nums, i, j);
	                i++;
	            } else if (nums[i] != 0) {
	                i++;
	            }
	        }
	        System.out.println(nums);
	    }
	 
	 public static void swap(int[] nums, int i, int j) {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
	}

}
