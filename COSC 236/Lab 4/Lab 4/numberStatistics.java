
// Ted Smith III   Cosc 236 Section 003
//  Lab 4 Problem 1
import java.io.*;
import java.util.*;

public class numberStatistics{
  public static void main(String [] args)  
  throws FileNotFoundException{
    
    
    numberStatistics();
    }
  
  public static void numberStatistics() 
  throws FileNotFoundException{
     Scanner score = new Scanner (new File ("score.txt"));
    
    double prev;
    int numStudent=0;
    double sumScore=0.0;
    int count = 0;
    double average;
    double min = 1000;
    double max = 0;
    
    while(score.hasNext()){ 
      if(score.hasNextDouble()){
        prev= score.nextDouble();
        
         if(prev<min) min = prev;
         if (prev>max) max= prev;
        numStudent++;
        sumScore = sumScore + prev;
        System.out.println(prev);
        count++;
      } 
      else {
        score.next();
      }          
    } 
    average = sumScore/count;
    System.out.println("Total numbers = " + count);
    System.out.print("Sum of numbers = ");
    System.out.println( (int)sumScore);
    
    System.out.println("Average score = " +  average);
    
    System.out.println("Minimum score = " + (int)min);
    System.out.println("Maximum number = " + (int)max);
  }
}

