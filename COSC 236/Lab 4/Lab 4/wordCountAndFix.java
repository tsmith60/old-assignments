// Ted Smith III   Cosc 236 Section 003
//  Lab 4 Problem 3

import java.io.*;
import java.util.*;


public class wordCountAndFix {
  public static void main(String[] args) 
  throws FileNotFoundException { 
   Scanner input = new Scanner(new File("lastone.txt")); 
   Scanner words = new Scanner(new File("lastone.txt"));
   Scanner characters = new Scanner( new File("lastone.txt"));
   Scanner longest = new Scanner (new File("lastone.txt"));
   countLines(input); 
   countWords(words);
   countCharacters(characters);
   longestWord(longest);
   } 
 
 public static void countLines(Scanner input) { 
  int count =0;
  int line = 0;
 
    while (input.hasNextLine()){
      
     
        line++;
        
      if (input.hasNext()){
        String text = input.nextLine();
    
    
    count++;
  
      }
      
    }
    
    

    System.out.println("There are "+ line+ " lines."); 

 }
 
 public static void countWords(Scanner input) { 
  int count =0;
 
 
    while (input.hasNextLine()){
      
     
        
        
      if (input.hasNext()){
        String text = input.next();
    
    
    count++;
  
      }
      
    }
    
    

    System.out.println("There are "+ count+ " words."); 

 }
 
 public static void countCharacters(Scanner input) { 
  int count =0;
  int sum = 0;
 
    while (input.hasNextLine()){
      
     
        
        
      if (input.hasNext()){
        String text = input.next();
    int i= text.length();
    sum += i;
    count++;
  
      }
      
    }
    
    

    System.out.println("There are "+ sum + " characters."); 

 }
 
  public static void longestWord(Scanner input) { 
  int count =0;
  int second= 0;
  int third = 0;
  String ha;
    while (input.hasNextLine()){
      
     
        
        
      if (input.hasNext()){
        String text = input.next();
    int i= text.length();
    if (i > third){
      third = i;
      ha =text;
      
    }
  
  
      }
      
    }
    
    

    System.out.println("The longest word is "+  third + " letters in length."); 

 }
  }
