//Ted Smith III   Cosc 236 Section 003
//  Lab 8 Problems 2 and 3
public class TestMystery1 {
 public static void main (String[] args){
 
  // Beginning of Question 2
  
  System.out.print("The beginning of question 2.");
  spaceon();
 System.out.println("When mystery1(6,13) is called, it returns " +mystery1(6,13)); 
 System.out.println("When mystery1(14,10) is called, it returns " +mystery1(14,10)); 
 System.out.println("When mystery1(37,10) is called, it returns " +mystery1(37,10)); 
 System.out.println("When mystery1(8,2) is called, it returns " +mystery1(8,2)); 
 System.out.println("When mystery1(50,7) is called, it returns " +mystery1(50,7)); 
 spaceon();
 //End of Question 2  and Beginning of Question 3
 System.out.println("The beginning of question 3.");
 spaceon();
 System.out.print("The method call mystery2(1) returns "); 
 mystery2(1);
 System.out.println();
 System.out.print("The method call mystery2(2) returns ");
  mystery2(2);
  System.out.println();
  System.out.print("The method call mystery2(3) returns ");
  mystery2(3);
  System.out.println();
  System.out.print("The method call mystery2(4) returns ");
  mystery2(4);
  skip();
  System.out.print("The method call mystery2(16) returns ");
  mystery2(16);
  skip();
  System.out.print("The method call mystery2(30) returns ");
  mystery2(30);
  skip();
  System.out.print("The method call mystery2(100) returns ");
  mystery2(100);
  skip();
// End of Question 3
 }
 public static int mystery1(int x, int y) {//Method for Question 2
     if (x < y)
         return x;
     else
         return mystery1(x - y, y);
 }
 public static void mystery2(int n) {// Method for Question 3
     if (n <= 1)
         System.out.print(n);
     else {
         mystery2(n / 2);
         System.out.print(", " + n);
     }
 }
 public static void spaceon(){
  System.out.println();
  System.out.println();
  
  
 }
 public static void skip(){
  System.out.println();
 }
}
