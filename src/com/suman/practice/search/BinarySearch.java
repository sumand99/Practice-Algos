/**
 * 
 */
package com.suman.practice.search;

/**
 * @author sumandutta
 *
 */
public class BinarySearch {

	 public int binarySearch(int[] inputArr, int key) {
		 
		 int start=0;
		 int end = inputArr.length-1;
		 
		 while(start<=end){
			 int median = (start+end)/2;
			 
			 if(key==inputArr[median]){
				 return median;
			 }
			 
			 if(key< inputArr[median]){
				 end = median-1;
			 }else{
				 start = median+1;
			 }
		 }
		 
		 return -1;
	 }
	  
	    public static void main(String[] args) {
	         
	        BinarySearch mbs = new BinarySearch();
	        int[] arr = {2,5,7,9,12}; 
	        System.out.println("Key 8's position: "+mbs.binarySearch(arr, 8));
	        int[] arr1 = {6,34,78,123,432,900};
	        System.out.println("Key 432's position: "+mbs.binarySearch(arr1, 432));
	      
	        
	        int[] arr3 = {6,900,34,78,123,432};
	        
	       java.util.Arrays.sort(arr3);
	        
	        System.out.println("Sorted Arr="+ arr3.toString());

	    }

}




/*


         
	        int start = 0;
	        int end = inputArr.length - 1;
	        while (start <= end) {
	            int mid = (start + end) / 2;
	            if (key == inputArr[mid]) {
	                return mid;
	            }
	            if (key < inputArr[mid]) {
	                end = mid - 1;
	            } else {
	                start = mid + 1;
	            }
	        }
	        return -1;
	    

*/