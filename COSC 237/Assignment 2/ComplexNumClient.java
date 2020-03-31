//    Assignment2 Question 1 Class ComplexNumClient 
//        Ted Smith III  COSC 237-003
import java.util.*;
public class ComplexNumClient {
  public static void main(String [] args){
 
    Scanner input = new Scanner(System.in);
    int option = 0;
    int counter = 0;
  
    ComplexNumber cn1;
    ComplexNumber cn2;
    ComplexNumber cn3 = new ComplexNumber();
    ComplexNumber cn4 = new ComplexNumber();
  
    do{
      counter++;
      do{
        option = menu(input);
        
        if(option<0 || option >6){
          System.out.println("The option is out of range.");
        }
        
      }while(option<0 || option >6);
      System.out.println();
      
      
      
      
      switch(option){
        
        case 1: 
            cn1 = cn3.read(input);
            cn2 = cn4.read(input);
            System.out.println("First complex number is: " + cn1);
            System.out.println("Second complex number is: " + cn2);
            ComplexNumber addcn = cn1.add(cn2);
            System.out.println("Result : " +cn1+" + "+cn2 + " = " + addcn);
          
            com(counter);
            break;
        case 2:  
            cn1 = cn3.read(input);
            cn2 = cn4.read(input);
            System.out.println("First complex number is: " + cn1);
            System.out.println("Second complex number is: " + cn2);
            ComplexNumber subcn = cn1.subtract(cn2);
            System.out.println("Result : " +cn1+" - "+cn2 + " = " + subcn);
          
          
            com(counter);
            break;
        case 3:  
            cn1 = cn3.read(input);
            cn2 = cn4.read(input);
            System.out.println("First complex number is: " + cn1.toString());
            System.out.println("Second complex number is: " + cn2.toString());
            ComplexNumber multcn = cn1.multiply(cn2);
            System.out.println("Result : " +cn1+" * "+cn2 + " = " + multcn);
          
            com(counter);
            break;
        case 4:  
            cn1 = cn3.read(input);
            cn2 = cn4.read(input);
            System.out.println("First complex number is: " + cn1.toString());
            System.out.println("Second complex number is: " + cn2.toString());
            ComplexNumber divcn = cn1.divide(cn2);
            System.out.println("Result : " +cn1+" / "+cn2.toString() + " = "+ divcn);
          
            com(counter);
            break;
        case 5:  
             cn1 = cn3.read(input);
          
             System.out.println("First complex number is: " + cn1);
          
             System.out.printf("Result: |"+cn1+"| = %.02f\n",cn1.cAbs());
          
             com(counter);
             break;
        case 6:  
            cn1 = cn3.read(input);
            cn2 = cn4.read(input);
            System.out.println("First complex number is: " + cn1);
            System.out.println("Second complex number is: " + cn2);
            if(cn1.equals(cn2)){
              System.out.println("The complex numbers are equal. ");
            }
            else{
              System.out.println("The complex numbers are NOT equal. ");
            }
          
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
   
   System.out.println("Your options for Complex arithmetic are:");
   
   printDashes();
   System.out.println();
   
   System.out.println("\t1)  Add 2 complex numbers  ");
   
   System.out.println("\t2)  Subtract 2 complex numbers ");
   
   System.out.println("\t3)  Multiply 2 complex numbers ");
   
   System.out.println("\t4)  Divide 2 complex numbers ");
   
   System.out.println("\t5)  Absolute value of a complex number ");
   
   System.out.println("\t6)  Compare 2 complex numbers ");
   
   System.out.println("\t0)  EXIT "); 
   
   System.out.print("Please enter your option: ");
   
   
   
   return getInt(input);
 }
 
 public static void printDashes(){
   for (int i = 0; i <17; i++){
     System.out.print("-");
   }
 }
 public static void com(int counter){
   System.out.printf("\tCommand number %d is completed.", counter);
   
   System.out.println("\n");
 }
 
 public static int getInt(Scanner input){
   while (!input.hasNextInt()){
     
     input.next();
     System.out.println("Not integer! Try again!");
     
   }
   return input.nextInt();
 }
}
////////////////////End of the Source Code for the ComplexNumClient class