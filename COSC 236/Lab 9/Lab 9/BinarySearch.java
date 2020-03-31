// Ted Smith III   Cosc 236 Section 003
//Lab 9 Questions 1 and 2

import java.util.*;


public class BinarySearch {
   public static void main (String [] args){
	   
	   //Question 1: Binary Search
	   int[] list = {-2, 8, 13, 22, 25, 25, 38, 42, 51, 103};
	   
	   System.out.println(binarySearch(list,13));
	   System.out.println(binarySearch(list, 103, 0, 9));
	 //For Question 1.1 the answers are min is 0, max is 9, 
	 // and mid is 4 and the value 9 would be returned
	   
	    System.out.println(binarySearch(list, 30, 2, 8));
	  //For Question 1.2 the answers are min is 2, max is 8, 
	  // and mid is 5 and the value -1 would be returned
	    
	    
	  //Question 2 : Efficiency and Big Oh No Notation
	    //For Question 2.1
	  //the estimated runtime isn^2
	    
	    
	   //For Question2.2 
	    //the estimated runtime is n^2
	    
	    /*
	    int sum = 0;
	    for (int i = 1; i <= n; i++) {
	        sum++;
	    }
	    for (int j = 1; j <= n / 2; j++) {
	        sum++;
	    }*/

	    
	   
	    
	    
	    
	    
   }
   
   
   
   
   public static int binarySearch(int[] a, int target) {
	    return binarySearch(a, target, 0, a.length - 1);
	}
	 
	public static int binarySearch(int[] a, int target,
	                                int min, int max) {
	    if (min > max) {
	        return -1;        // target not found
	    } else {
	        int mid = (min + max) / 2;
	        if (a[mid] < target) {         // too small; go right
	            return binarySearch(a, target, mid + 1, max);
	        } else if (a[mid] > target) {  // too large; go left
	            return binarySearch(a, target, min, mid - 1);
	        } else {
	            return mid;   // target found; a[mid] == target
	        }
	    }
	}
}
