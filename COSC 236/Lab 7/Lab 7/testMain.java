//Ted Smith III   Cosc 236 Section 003
//  Lab 7 Problem 2

public class testMain {
  public static void main (String [] args) {
    
    Pond[] ponds = {new Ocean(), new Pond(), new Lake(), new Bay()}; 
    for (Pond p: ponds) {

     p.method1();

     System.out.println();

     p.method2();

     System.out.println();

     p.method3();

     System.out.println();

}
    // Part 1 of the Question
    System.out.println("This is the end of part 1 of the question.");
    System.out.println();
    System.out.println();
    
    Pond var1 = new Bay();

    Object var2 = new Ocean();
    ((Lake) var1).method1();

    ((Bay) var1).method1();

    ((Pond) var2).method2(); 

    ((Lake) var2).method2(); 

    ((Ocean) var2).method3();
    System.out.println();
      // Part 2 of the Question
  System.out.println("This is the end of part 2 of the question.");
    }

}