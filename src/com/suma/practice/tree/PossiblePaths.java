package com.suma.practice.tree;

//Number of possible Paths in N X N matrix from (0,0) to (n,n) position. 
public class PossiblePaths {

	public PossiblePaths() {
		// TODO Auto-generated constructor stub
	}
	  // from the topmost leftmost cell (cell at 1, 1) 
    static int numberOfPaths(int m, int n) 
    { 
    	 if (m == 0 && n == 0) 
             return 0;
        // If either given row number is first or 
        // given column number is first 
        if (m == 1 || n == 1) 
            return 1; 
  
        // If diagonal movements are allowed then 
        // the last addition is required. 
        return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1); 
        // + numberOfPaths(m-1, n-1); 
    } 
  
    public static void main(String args[]) 
    { 
        System.out.println(numberOfPaths(2, 2)); 
    } 

}
