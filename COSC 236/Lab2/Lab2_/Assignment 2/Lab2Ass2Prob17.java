public class Lab2Ass2Prob17 {
  public static void main (String[] args) {
      SlashFigure2();
      }
    
    public static final int SIZE = 8;
    public static void SlashFigure2() { 
    for (int line = 0; line < SIZE; line++) { 
        System.out.print(""); 
 
        for (int left = 0; left < (2*line); left++) { 
            System.out.print("\\"); 
        } 
 
        
 
        for (int exclam = 0; exclam < (4*SIZE -2)-4*line; exclam++) { 
            System.out.print("!"); 
        } 
 
         
        for (int right = 0; right < (2*line); right++) { 
            System.out.print("/"); 
        }
        System.out.println();
 // Lab 2 Assignment 2 Problem 17 
 // You can change the constant and everything will still work fine and the pic
 // will form based on the constant.
    }
}
}