//     Assignment 1 Question 2
//    Ted Smith III COSC 237-003

import java.util.*;


public class Assignment1Ex2{
  public static void main(String [] arg){
    int sum;
    int n;
    char dec;
    Scanner input = new Scanner(System.in);
    do{
      do{
        System.out.print("Enter the size of the magic square (positive & odd) :");
        n = getInt(input);
        if(n%2!=1||n<=0){
          System.out.println("INPUT ERROR!!! Invalid size.");
        }
      }while(n%2!=1||n<=0);
      
      
      int[][]b=new int[n][n];
      formMagic( b,n);
      sum = add(b,n);
      
      
      System.out.println();
      print(b,n);
      System.out.printf("The %dx%d magic square adds up to %d\n\n",n,n,sum);
      
      System.out.print("Do you want to continue (Y/N): ");
      
      dec = getDec(input);
      
      
    }while(dec =='Y' || dec == 'y');
  }
  
  public static char getDec(Scanner input){
    while(input.hasNextInt()||input.hasNextDouble()){
      input.next();
      System.out.println("Not a character! Try again!");
    }
    return input.next().charAt(0);
    
  }
  public static int getInt(Scanner input){
    
    
    while (!input.hasNextInt()){
      
      input.next();
      System.out.println("Not integer! Try again!");
      
    }
    return input.nextInt();
  }
  public static void formMagic(int[][]a,int n){
    
    int counter = 2;
    int i = n-1;
    int j = (n/2)+1;
    
    
    
    a[0][(n/2)] = 1;
    
    
    
    while(counter<=(n*n)){
      
      
      if(i==-1&&j==n){// This checks to make sure it doesn't go out the top right boundary.
        i++;
        i++;
        j--;
      }
      
      if(i==-1){//This checks to make sure it doesn't go out the top boundary.
        i=n-1;
        
        
      }
      if(j==n){//This checks to make sure it doesn't go out the right boundary.
        j=0; 
        
      }
      if(i==0 && j==(n/2)){//This checks to make sure nothing tries to take 1's spot.
        i++;
        i++;
        j--;
        
        
      }
      
      
      
      
      
      if(a[i][j]!=0){/* This checks to make sure there isn't already a number in a certain
       * position. */
        
        
        i++;
        i++;
        j--;
      }
      
      
      a[i][j] = counter;
      
      
      
      i--;
      j++;
      counter++;
      
      
    }
  }
  
  
  public static void print(int [][] a, int n){
    System.out.printf("The magic square with size = %d is : \n \n",n);
    
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        System.out.printf("%6d", a[i][j]); 
        
      }
      System.out.println("\n");
      
    }
  }
  
  
  public static int add(int [][]a, int n){
    int sum=0;
    for(int k = 0; k < n; k++){
      sum +=a[0][k];
    }
    return sum;
  }
}/////////////End of Source Code for #2