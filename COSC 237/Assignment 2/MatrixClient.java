//    Assignment2 Question 2 Class MatrixClient 
//        Ted Smith III   COSC 237-003

import java.util.*;
public class MatrixClient { 
    public static final int MAX = 20; 
    public static final int LOW = 1; 
    public static final int UP = 10;

    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        int choice ;  
        int numCommands = 0; 
        int size; 
        int value; 
        int tr; 
       
        
        do{
          System.out.print("Enter the size of the square matrices: ");
          size = getInt(input);
          
          if(size<0 || size >20){
            System.out.println("INPUT ERROR!!! Invalid size. Positive and <= 20.");
          }
        }while(size<0 || size>20);
        
        do{
          numCommands++;
          
          
          
          
          Matrix first = new Matrix(size); 
          Matrix second = new Matrix(size); 
          Matrix result = new Matrix(size); 
          do{
            choice = menu(input); 
            if(choice<0 || choice >8){
              System.out.println("The integer is out of range.");
            }
          }while (choice < 0|| choice >8);
          
          
          
          switch(choice){
            case 1: 
                System.out.println("The first matrix is:");
                first.init(LOW, UP);
                first.print();
                System.out.println("The second matrix is: ");
                second.init(LOW, UP);
                second.print();
                System.out.println("The resulting matrix is: ");
                result.copy( first.add(second));
                result.print();
                com(numCommands);
                break;
            case 2:
                System.out.println("The first matrix is: ");
                first.init(LOW, UP);
                first.print();
                System.out.println("The second matrix is: ");
                second.init(LOW, UP);
                second.print();
                System.out.println("The resulting matrix is: ");
                result.copy(first.subtract(second));
                result.print();
                
                com(numCommands);
                break;
            case 3:
                System.out.println("The first matrix is:");
                first.init(LOW, UP);
                first.print();
                System.out.println("The second matrix is: ");
                second.init(LOW, UP);
                second.print();
                System.out.println("The resulting matrix is: ");
                result.copy(first.multiply(second));
                result.print();
                
                com(numCommands);
                break;
            case 4:
                System.out.println("Enter the multiplication constant");
                first.init(LOW, UP);
                value = getInt(input);
                System.out.println("The original matrix is: ");
                first.print();
                System.out.println("The resulting matrix :");
                result.copy(first.multiplyConst(value));
                result.print();
                com(numCommands);
                break;
            case 5:
                System.out.println("The original matrix is: ");
                first.init(LOW, UP);
                first.print();
                System.out.println("The resulting matrix is: ");
                result.copy(first.transpose());
                result.print();
                com(numCommands);
                break;
            case 6:
                System.out.println("The original matrix is:");
                first.init(LOW, UP);
                first.print();
                tr = first.trace();
                System.out.printf("The trace for this matrix is: %d\n",tr);
                com(numCommands);
                break;
            case 7:
                System.out.println("The original matrix is: ");
                first.init(LOW, UP);
                first.print();
                result.copy(first);
                System.out.println("The copy of the matrix is: ");
                result.print();
                System.out.println("Testing for equality. Should be equal!! \nThe matrices are equal!! ");
                com(numCommands);
                break;
            case 8:
                System.out.println("First matrix is: ");
                first.init(LOW, UP);
                first.print();
                System.out.println("Second matrix is: ");
                second.init(LOW, UP);
                second.print();
                if(first.equals(second)){
                  System.out.println("The matrices are equal.");
                }
                else{
                  System.out.println("The matrices are NOT equal!!!");
                }
                com(numCommands);
                
                break;
            case 0:
                System.out.println("Testing completed.");
                numCommands=0;
              
          }
        }while(numCommands!= 0);
        
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
      
      System.out.println("\t7)  Make a copy ");
      
      System.out.println("\t8)  Test for equality ");
      
      System.out.println("\t0)  EXIT "); 
      
      System.out.print("Please enter your option: ");
      
      
      
      return getInt(input);
    }
    
    public static void printDashes(){
      for (int i = 0; i <17; i++){
        System.out.print("-");
      }
    }
    
    public static int getInt(Scanner input){
      
      
      while (!input.hasNextInt()){
        
        input.next();
        System.out.println("Not integer! Try again!");
      }
      
      return input.nextInt();
      
    }
    public static void com(int counter){
      System.out.printf("             Command number %d is completed.", counter);
      
      System.out.println("\n");
    }
    
} 
////////////////////End of the Source Code for the MatrixClient class