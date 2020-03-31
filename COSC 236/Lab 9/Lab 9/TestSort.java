// Ted Smith III   Cosc 236 Section 003
//Lab 9 Question 3
import java.util.*;

// The answer to this question is in 
//the documents in the zip file. This java file
// is just a tester to understand the methods.
public class TestSort {
  public static void main(String[] args){
	  //Question 3 : Sorting
	  
	  
	  int sortGroup[] = {7, 1, 6, 12, -3, 8, 4, 21, 2, 30, -1, 9};
	  int mergeGroup[] = {7, 1, 6, 12, -3, 8, 4, 21, 2, 30, -1, 9};
	  System.out.println(Arrays.toString(sortGroup));
	  
	  System.out.println();
	  System.out.println();
		 
	 selectionSort(sortGroup);
	  
	 System.out.println(Arrays.toString(sortGroup));
	 
	 System.out.println();
	 System.out.println();
	 
	  System.out.println(Arrays.toString(mergeGroup));
	  
  }
  public static void selectionSort(int[] a) {
	    for (int i = 0; i < a.length - 1; i++) {
	        // find index of smallest remaining value
	        int min = i;
	        for (int j = i + 1; j < a.length; j++) {
	            if (a[j] < a[min]) {
	                min = j;
	            }
	        }

	        // swap smallest value its proper place, a[i]
	        swap(a, i, min);
	        System.out.println(Arrays.toString(a));
	    }
	}

  
  public static void swap(int[] a, int i, int min) {
	    if (i != min) {
	        int temp = a[i];
	        a[i] = a[min];
	        a[min] = temp;
	    }
	}

  public static void mergeSort(int[] a) {
	    if (a.length >= 2) {
	        // split array into two halves
	        int[] left  = Arrays.copyOfRange(a, 0, a.length/2);
	       // System.out.println("Mergeleft" +Arrays.toString(left));
	        int[] right = Arrays.copyOfRange(a, a.length/2, a.length);
	       // System.out.println("Mergeright" +Arrays.toString(right));
	        // sort the two halves
	        mergeSort(left);
	        mergeSort(right);
	        // merge the sorted halves into a sorted whole
	        merge(a, left, right);
	    }
	}
	 
  public static void merge(int[] result, int[] left, 
          int[] right) {
int i1 = 0;   // index into left array
int i2 = 0;   // index into right array

for (int i = 0; i < result.length; i++) {
if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
result[i] = left[i1];    // take from left
i1++;
} else {
result[i] = right[i2];   // take from right
i2++;
  }
 }
}

}
