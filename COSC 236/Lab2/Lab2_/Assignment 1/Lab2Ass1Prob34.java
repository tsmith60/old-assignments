public class Lab2Ass1Prob34 {
  public static void main (String[] args) {
      SlashFigure();
      }
    
    public static final int SIZE = 6;
    public static void SlashFigure() { 
    for (int line = 0; line < SIZE; line++) { 
        System.out.print(""); 
 
        for (int left = 0; left < (2*line); left++) { 
            System.out.print("\\"); 
        } 
 
        
 
        for (int exclam = 0; exclam < ((4*SIZE-2)-4*line); exclam++) { 
            System.out.print("!"); 
        } 
 
         
        for (int right = 0; right < (2*line); right++) { 
            System.out.print("/"); 
        }
        System.out.println();
 
    }
}
}


// Number 34 Write a table that determines the expressions for the number of each type of character on each of the 6 lines in the 
//following output. 

// !!!!!!!!!!!!!!!!!!!!!! 
// \\!!!!!!!!!!!!!!!!!!// 
// \\\\!!!!!!!!!!!!!!//// 
// \\\\\\!!!!!!!!!!////// 
// \\\\\\\\!!!!!!//////// 
// \\\\\\\\\\!!//////////
