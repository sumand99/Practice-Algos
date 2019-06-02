package com.suma.practice.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public CombinationSum() {
		// TODO Auto-generated constructor stub
	}

	
	public static List<List<Integer>> combinationSum(int[] candidates, int target){
		List<List <Integer>> result = new ArrayList<>();
		Arrays.sort(candidates);
		findCombination(candidates,0,new ArrayList<Integer>(),result,target);
		return result;
	}
	
	
	
	public static void findCombination(int [] candidates, int index, List<Integer> current, List<List<Integer>>results,int target) {
		if(target==0){
			results.add(new ArrayList<Integer>(current));
            return;
		}
		
		if(target<0){
			return;
		}
		
		
		for(int i=index;i<candidates.length;i++){
			if(i==index || candidates[i]!=candidates[i-1]){
				current.add(candidates[i]);
				findCombination(candidates, i+1, current,results, target-candidates[i]);
				current.remove(current.size()-1);
			}
		}
	}
	
	public static void main(String args[]){
		int[] candidates = {10,1,2,7,6,1,5};
		int target =13;
		System.out.println(combinationSum(candidates, target));
	}
}
