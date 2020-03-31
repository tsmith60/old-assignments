// Ted Smith III   Cosc 236 Section 003
//  Lab 4 Problem 2

import java.io.*;
import java.util.*;

public class negativeSum{
  public static void main(String [] args)  
  throws FileNotFoundException{
     Scanner score = new Scanner (new File ("negative.txt"));
      int prev;
    
    int sumScore=0;
    int count = 0;
    
     while(score.hasNext()){ 
       
      if(score.hasNextInt()){
       prev = score.nextInt();
       sumScore += prev;
       
        count++;
        
         negativeSum(sumScore, count);
      } 
      else {
        score.hasNext();
      }          
    } 
  
    
    
    }
  
  public static String negativeSum(int sum,int count) 
  throws FileNotFoundException{
    
    
   
    if(sum<0) {
      System.out.println("           " + sum + " after " + count + " steps"); }
    else{
      System.out.println("No negative sum after " + count + " steps.");  }
    

    return("");
  }
}



