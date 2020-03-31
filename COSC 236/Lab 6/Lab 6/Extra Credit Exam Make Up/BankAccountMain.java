//Ted Smith III   Cosc 236 Section 003
//  Lab 6 Problem 4 Extra Credit Exam 2 Make-up

import java.io.*;
import java.util.*;


public class BankAccountMain {
  public static void main (String [] args)
  throws FileNotFoundException {
    Scanner input = new Scanner(new File("account.txt"));
    int numAccount = input.nextInt();
    
    int [] ba = new int [numAccount];
    String [] na = new String [numAccount];
    
    int min = 99999999;
    int max = 0;
    int sum = 0;
    int average;
    for (int i = 0; i < numAccount; i++){
      
    na[i] = input.next();
    ba[i] = input.nextInt();
    
    }
    for (int i=0; i <numAccount; i++){
      
      System.out.println("Line #" + (i+1) + " Name: "+ na[i]+ " Balance: " + ba[i]);
      if (ba[i]<min){
        min = ba[i];
      }
      else{
      }
      if(ba[i]>max){
        max = ba[i];
      }
      else{
      }
      sum += ba[i];
    }
    
    System.out.println("The lowest balance is $" + min + " .");
    System.out.println("The highest balance is $" + max + " .");
    System.out.println("The average balance is $" + ((double)sum/numAccount) + "0 .");
    
    BankAccount idk1 = new BankAccount();
    BankAccount idk2 = new BankAccount();
    BankAccount idk3 = new BankAccount();
    BankAccount idk4 = new BankAccount();
    BankAccount idk5 = new BankAccount();
    BankAccount idk6 = new BankAccount();
    BankAccount idk7 = new BankAccount();
    BankAccount idk8 = new BankAccount();
    BankAccount idk9 = new BankAccount();
    BankAccount idk10 = new BankAccount();
      idk1.name = na[0];// here is where my next is
      idk1.balance = ba[0];
      idk2.name = na[1];
      idk2.balance = ba[1];
      idk3.name = na[2];
      idk3.balance = ba[2];
      idk4.name = na[3];
      idk4.balance = ba[3];
      idk5.name = na[4];
      idk5.balance = ba[4];
      idk6.name = na[5];
      idk6.balance = ba[5];
      idk7.name = na[6];
      idk7.balance = ba[6];
      idk8.name = na[7];
      idk8.balance = ba[7];
      idk9.name = na[8];
      idk9.balance = ba[8];
      idk10.name = na[9];
      idk10.balance = ba[9];
       
      
     
  }
}