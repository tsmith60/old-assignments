// Ted Smith III   Cosc 236 Section 003
//  Program Assignment 2 Problem 3


import java.util.*;

public class countLastDigits{
  public static void main (String[] args){
   
  
    int[] list = {9, 29, 44, 103, 2, 52, 12, 12, 76, 35, 20};
        int[] count = new int[10];
        countLastDigits(list, count);
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(count));
  }
  public static int[] countLastDigits(int[] list, int[] count){
    
    for (int i = 0; i < list.length; i++){
      
     int hey = list[i]%10;
     count[hey]++;
    }
    return  count;
  }
      
    
  

}