// Ted Smith III   Cosc 236 Section 003
//  Program Assignment 2 Problem 2

import java.util.*;
 
public class TestRotateRight {
    public static void main(String[] args) {
        int[] list = {3, 8, 19, 7};
        rotateRight(list);
        System.out.println(Arrays.toString(list));   // [7, 3, 8, 19]
        rotateRight(list);
        rotateRight(list);
        System.out.println(Arrays.toString(list));   // [8, 19, 7, 3]
        rotateRight(list);
        System.out.println(Arrays.toString(list));   // [3, 8, 19, 7]
        rotateRight(list);
        rotateRight(list);
        rotateRight(list);
        System.out.println(Arrays.toString(list));   // [8, 19, 7, 3]
        rotateRight(list);
        rotateRight(list);
        rotateRight(list);
        rotateRight(list);
        System.out.println(Arrays.toString(list));   // [8, 19, 7, 3]
    }
    public static int[] rotateRight( int[] test){
      for (int i = 0; i < 1; i++){
        int k = test[3];
        test[3] = test [2];
        test[2] = test[1];
        test[1] = test[0];
        test[0] = k;
      }
      
    return test ;
}
}