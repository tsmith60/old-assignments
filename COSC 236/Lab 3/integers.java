
/*Lab 3 Problem 5
  Ted Smith III 
  COSC 236-003 */

import java.util.*;
public class integers{
  public static void main (String[]args){
    Scanner console = new Scanner(System.in);
    int count;
    int sum=0;
    int min=0;
    int max=0;
    double aver;
    System.out.print("How many integers? ");
    count = console.nextInt();
    
    
    
    
    for (int i = 1; i<=count; i++){
      
      System.out.print("Next integer? ");
       int number1 = console.nextInt();
       if(number1==number1){
         
          sum+=number1;
          
       }
       
       if (i==1){
         min = number1;
         max = number1;
    }
       else{
        if(number1 < min) min = number1;
        if(number1 > max) max = number1;
       }
   }
    
    System.out.println("Min = " + min);
    System.out.println("Max = " + max);
    System.out.println("Sum = " + sum);
    aver = ((double)sum/count) ;
    System.out.println("Average = "+aver);
  }
}