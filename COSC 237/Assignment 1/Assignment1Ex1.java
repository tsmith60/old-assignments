//   Assignment 1 Question 1
//    Ted Smith III COSC 237-003

import java.util.*;
public class Assignment1Ex1 {
  public static void main (String [] args){
    int min = 1;
    int max = 10;
    int counter = 0;
    int size = 0;
    int option = 0;
    int constant = 0;
    Scanner input = new Scanner(System.in);
    
    
    
    do{
      counter++;
      do{
        option = menu(input);
        
        if(option<0 || option >6){
          System.out.println("The integer is out of range.");
        }
        
      }while(option<0 || option >6);
      
      if(option != 0){
        
        do{
          size = getInt(input);
          
          if(size<0 || size >10){
            System.out.println("The integer is out of range. Try again. A size between 0 and 10");
          }
        }while(size<0 || size>10);
        
      }
      
      
      int [] [] matrix1 = new int [size][size];
      int[] [] matrix2 = new int[size] [size];
      
      
      switch(option){
        case 1: System.out.println("First matrix is: ");
        
        generate(size, matrix1,min,max);
        print(size, matrix1);
        System.out.println();
        System.out.println("Second matrix is: ");
        
        generate(size,matrix2,min,max);
        print(size, matrix2);
        System.out.println();
        System.out.println("The resulting matrix is: ");
        
        int[][]sum = new int [size][size];
        add(size,sum,matrix1,matrix2);
        print(size, sum);
        com(counter);
        break;
        case 2:  System.out.println("First matrix is: ");
        
        generate(size, matrix1,min,max);
        print(size, matrix1);
        System.out.println();
        System.out.println("Second matrix is: ");
        
        generate(size,matrix2,min,max);
        print(size, matrix2);
        System.out.println();
        System.out.println("The resulting matrix is: ");
        int[][]diff = new int[size][size];
        subtract(size,diff,matrix1,matrix2);
        print(size, diff);
        com(counter);
        break;
        case 3:  System.out.println("First matrix is: ");
        generate(size, matrix1,min,max);
        print(size, matrix1);
        System.out.println();
        System.out.println("Second matrix is: ");
        
        generate(size,matrix2,min,max);
        print(size, matrix2);
        System.out.println("The resulting matrix is: ");
        int[][]prod = new int[size][size];
        multiplymatrix(size,prod,matrix1,matrix2);
        print(size, prod);
        com(counter);
        break;
        case 4:  System.out.print("Enter the multiplication constant: ");
        
        constant = constvalidate(input);
        System.out.println();
        System.out.println("The matrix is: ");
        generate(size, matrix1,min,max);
        print(size, matrix1);
        System.out.printf("The original matrix multiplied by %d is: \n",constant);
        
        int[][]prodc = new int[size][size];
        multiplybyconst(size,prodc,matrix1,constant);
        print(size, prodc);
        com(counter);
        break;
        case 5:  System.out.println("The matrix is: ");
        generate(size, matrix1,min,max);
        print(size, matrix1);
        System.out.println("The transposed matrix is: ");
        int[][]trans = new int [size][size];
        transpose(size,trans,matrix1);
        print(size, trans);
        com(counter);
        break;
        case 6:  System.out.println("The matrix is: ");
        generate(size, matrix1,min,max);
        print(size, matrix1);
        int trace = mattrace(size,matrix1) ;
        System.out.printf("The trace for this matrix is: %d\n", trace);
        com(counter);
        break;
        case 0:  System.out.println("Testing completed.");
        counter = 0;
        break;
        
      }
      
      System.out.println();
      
    }while(counter != 0);
    
    
    
    
    
  }
  
  public static int menu(Scanner input){
    
    System.out.println("Your options are:");
    
    printDashes();
    System.out.println();
    
    System.out.println("\t1)  Add 2 matrices ");
    
    System.out.println("\t2)  Subtract 2 matrices ");
    
    System.out.println("\t3)  Multiply 2 matrices ");
    
    System.out.println("\t4)  Multiply matrix by a constant ");
    
    System.out.println("\t5)  Transpose matrix ");
    
    System.out.println("\t6)  Matrix trace ");
    
    System.out.println("\t0)  EXIT "); 
    
    System.out.print("Please enter your option: ");
    
    while (!input.hasNextInt()){
      
      input.next();
      System.out.println("Not integer! Try again!");
      
    }
    
    return input.nextInt();
  }
  public static void printDashes(){
    for (int i = 0; i <17; i++){
      System.out.print("-");
    }
  }
  
  public static void print(int size, int[][]m){
    for (int i = 0; i <= size-1; i++){
      for (int j = 0; j <= size-1; j++){
        System.out.printf("%4d",m[i][j]);
      }
      System.out.println();
    }
    
    
  }
  public static int getInt(Scanner input){
    System.out.print("Enter the size of the square matrices: ");
    
    while (!input.hasNextInt()){
      
      input.next();
      System.out.println("Not integer! Try again!");
    }
    
    return input.nextInt();
    
  }
  
  public static void generate(int size, int[][] matrix,int min,int max){
    Random rand = new Random();
    
    for (int i = 0; i <= size-1; i++){
      for (int j = 0; j <= size-1; j++){
        matrix[i][j] = rand.nextInt(max-min)+min;
        
      }
      
    }
    
  }
  
  public static void add(int size,int [] [] sum, int [] [] matrix1, int [] [] matrix2){
    
    for (int i = 0; i <= size-1; i++){
      for (int j = 0; j <= size-1; j++){
        sum[i][j] = matrix1[i][j] + matrix2[i][j]; 
        
      }
      
    }
  }
  
  public static void subtract(int size,int [] [] diff, int [] [] matrix1, int [] [] matrix2){
    
    for (int i = 0; i <= size-1; i++){
      for (int j = 0; j <= size-1; j++){
        diff[i][j] = matrix1[i][j] - matrix2[i][j]; 
        
      }
      
    }
  }
  public static void multiplymatrix(int size, int[][]prod,int [][] matrix1, int[][] matrix2){
    
    for (int i = 0; i < size; i++){
      for (int j = 0; j < size; j++){
        prod[i][j] = 0;
        for (int k = 0; k < size; k++){
          prod[i][j] += matrix1[i][k] * matrix2[k][j]; 
          
          
        }
        
        
        
      }
      
    }
  }
  
  public static void multiplybyconst(int size,int[][] prodc,int[][] matrix1,int constant){
    
    for (int i = 0; i < size; i++){
      for (int j = 0; j < size; j++){
        prodc[i][j] = matrix1[i][j] * constant; 
        
        
      }
    }
  }
  public static void transpose(int size,int[][] trans,int[][] matrix1){
    
    for (int i = 0; i < size; i++){
      for (int j = 0; j < size; j++){
        trans[i][j] = matrix1[j][i]; 
        
      }
      
    }
  }
  
  public static int mattrace(int size, int[][] matrix){
    int sum = 0;
    
    for (int i = 0; i <= size-1; i++){
      
      sum += matrix[i][i];
    }
    
    return sum;
  }
  public static void com(int counter){
    System.out.printf("                       Command number %d is completed.", counter);
    
    System.out.println("\n");
  }
  
  public static int constvalidate(Scanner input){
    while (!input.hasNextInt()){
      
      input.next();
      System.out.println("Not integer! Try again!");
      
    }
    
    return input.nextInt();
  }
  
}//////////////End of Source Code #1