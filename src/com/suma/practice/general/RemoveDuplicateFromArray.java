package com.suma.practice.general;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

//public class RemoveDuplicateFromArray {
//
//	public RemoveDuplicateFromArray() {
//		// TODO Auto-generated constructor stub
//	}
//
//}

class RemoveDuplicateFromArray {
    public  int removeDuplicates(int[] nums) {
        SortedSet<Integer> set = new TreeSet<Integer>();
        for (int i=0;i<nums.length;i++){
            set.add(Integer.valueOf(nums[i]));          
        }
        
        Iterator<Integer> it = set.iterator();
        int j = 0;
        while (it.hasNext()){
        	nums[j++]= it.next();       	
        }
        
         return set.size();
    }
    
    public int removeDuplicates_no_collection(int[] nums){
    
    	    if (nums.length == 0) return 0;
    	    int i = 0;
    	    for (int j = 1; j < nums.length; j++) {
    	        if (nums[j] != nums[i]) {
    	            i++;
    	            nums[i] = nums[j];
    	        }
    	    }
    	    return i + 1;
    	
    }
    
    
    public static int[] removeDuplicatesConstantSpace(int[] nums){
    	int j=0;
    	for(int i=0;i<nums.length-1;i++){
    		if(nums[i]!=nums[i+1]){
    			nums[j++] = nums[i];
    		}
    	}
    	
    	nums[j] = nums[nums.length-1];
    	
    	return nums;
    	
    }
    
    public static void main(String args[]) {
    	RemoveDuplicateFromArray sol = new RemoveDuplicateFromArray();
        int nums[] = {1,2,2,3,3,3,4,4};
        int len = sol.removeDuplicates_no_collection(nums);
        
        nums = removeDuplicatesConstantSpace(nums);
        
        for (int i=0;i<len;i++){
            System.out.print(" "+nums[i]);
        }
        System.out.println("Size of the Array = " + len);
    }
}
