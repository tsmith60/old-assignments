
/*Lab 3 Problem 4
  Ted Smith III 
  COSC 236-003 */

import java.util.*;
public class grades{
  public static void main(String[] args){
    int grade1;
    
    Scanner console = new Scanner(System.in);
    System.out.println("If you wish to stop, type -1");
     System.out.print("Type grade :");
    grade1 = console.nextInt();
    evaluateGrade(grade1);
    while(grade1>0){
    System.out.println();
    System.out.print("Type grade :");
    grade1 = console.nextInt();
   evaluateGrade(grade1);
    }
  }
  public static void evaluateGrade(int grade1){
      
     double gradescale1 = (( grade1/10.0)- 6.0);
     
    if (gradescale1 >-1){
      System.out.println("Grade scale is  " + gradescale1);
    
    }
    
     else{
      
      System.out.print ("Bye!"); 
    }
  
  
    
    
    
     
    
    
    
  
  }}