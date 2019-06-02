package com.suma.practice.general;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public TwoSum() {
		// TODO Auto-generated constructor stub
	}

	public static int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	public static int[] twoSum2(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myIntArray = new int[]{11,2,9,11,16};
		//System.out.println(twoSum(myIntArray,9));
		System.out.println(twoSum2(myIntArray,11));
		int s = 2009;
		System.out.println(s/10 + "--" + s%10); //[1,2,3]
	}

}
