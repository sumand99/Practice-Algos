package com.suma.practice.general;

public class FlipHorizontal {

	public FlipHorizontal() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void flipHorizontal(int[][] matrix){
		int r = matrix.length -1 ;
		
		int c = matrix[0].length -1 ;
		
		int temp = 0;
		
		for(int i = 0;i < r/2 ; i++){
			for(int j=0; j<=c ; j++){
				temp = matrix[i][j];
				matrix[i][j] = matrix[r-1][j];
				matrix[r-1][j] = temp;
			}
		}
		
	}
	
	public static void flipItVerticalAxis(int[][] matrix) {
	    for(int i =0 ;i< matrix.length;i++){
	        
	        for(int j = 0 ;j< matrix[i].length-1;j++){
	            int temp = matrix[i][j];
	            matrix[i][j] = matrix[i][j+1];
	            matrix[i][j+1] = temp;
	            
	        }
	    }
	}
	
	
	public static void flipHorizontalAxis(int[][] matrix) {
		for(int j=0;j<matrix[0].length;j++){
			 int temp = matrix[matrix.length-1][j];
			 matrix[matrix.length-1][j]= matrix[0][j];
			 matrix[0][j] = temp;
		}
	   
	}

	public static void main(String[] args) {
		  // int[][] mat = new int[2][2];
		
			int[][]mat = {
						   {1,2,3},
						   {4,5,6},
						   {7,8,9}
						   };
			
			//flipHorizontal(mat);
			//flipItVerticalAxis(mat);
			//flipHorizontalAxis(mat);
			
			for(int i = 0;i<mat.length;i++){
				for(int j=0;j<mat[i].length;j++){
					System.out.println(mat[i][j]);
				}
				
		    }
			
		    
			
	}

}
